package esdras.spring.study.demo.services;

import esdras.spring.study.demo.domain.Book;
import esdras.spring.study.demo.repositories.BookRepository;
import org.springframework.stereotype.Service;


//SEGUIMOS UM CONTRATO COM O SERVIÇO, E NA IMPLEMENTAÇÃO DO CONTRATO, USAMOS O REPOSITORIO
//PARA FAZER AS OPERAÇÕES NO BANCO DE DADOS
@Service

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll() {
        return this.bookRepository.findAll();
    }
}

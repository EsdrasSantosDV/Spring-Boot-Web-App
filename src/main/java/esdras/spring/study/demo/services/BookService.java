package esdras.spring.study.demo.services;

import esdras.spring.study.demo.domain.Book;




public interface BookService {

    Iterable<Book> findAll();
}

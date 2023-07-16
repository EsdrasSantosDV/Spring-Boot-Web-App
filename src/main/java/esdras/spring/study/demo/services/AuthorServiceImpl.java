package esdras.spring.study.demo.services;

import esdras.spring.study.demo.domain.Author;
import esdras.spring.study.demo.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @Override
    public Iterable<Author> findAll() {
        return this.authorRepository.findAll();
    }
}

package esdras.spring.study.demo.services;

import esdras.spring.study.demo.domain.Author;



public interface AuthorService {
    Iterable<Author> findAll();
}

package esdras.spring.study.demo.repositories;

import esdras.spring.study.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

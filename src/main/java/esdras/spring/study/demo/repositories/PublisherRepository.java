package esdras.spring.study.demo.repositories;

import esdras.spring.study.demo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

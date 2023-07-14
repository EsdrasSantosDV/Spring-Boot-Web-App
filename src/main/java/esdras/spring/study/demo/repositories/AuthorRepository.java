package esdras.spring.study.demo.repositories;

import esdras.spring.study.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

//O PRIMEIRO ARGUMENTO E SEMPRE A CLASSE DE DOMINIO, E DEPOIS O TIPO DO ID DO DOMINIO
//O SPRING DATA EM TEMPO DE EXECUÇÃO QUE VIA FORNECER A IMPLEMENTAÇÃO
public interface AuthorRepository extends CrudRepository<Author,Long> {
}

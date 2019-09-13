package br.com.alfa.graphqlspringbootexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alfa.graphqlspringbootexample.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}

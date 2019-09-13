package br.com.alfa.graphqlspringbootexample.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.alfa.graphqlspringbootexample.model.Author;
import br.com.alfa.graphqlspringbootexample.model.Book;
import br.com.alfa.graphqlspringbootexample.repository.AuthorRepository;
import br.com.alfa.graphqlspringbootexample.repository.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}

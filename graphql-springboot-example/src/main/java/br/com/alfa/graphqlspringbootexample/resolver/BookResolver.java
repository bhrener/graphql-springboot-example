package br.com.alfa.graphqlspringbootexample.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.com.alfa.graphqlspringbootexample.model.Author;
import br.com.alfa.graphqlspringbootexample.model.Book;
import br.com.alfa.graphqlspringbootexample.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    
	private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId()).get();
    }
}
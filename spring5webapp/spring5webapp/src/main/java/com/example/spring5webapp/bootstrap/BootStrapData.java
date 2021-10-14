package com.example.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring5webapp.domain.Author;
import com.example.spring5webapp.domain.Book;
import com.example.spring5webapp.domain.Publisher;
import com.example.spring5webapp.repositories.AuthorRepository;
import com.example.spring5webapp.repositories.BookRepository;
import com.example.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Author prashant = new Author("Prashant", "Doshi");
		Book dmuu = new Book("Decision Making Under Uncertainty","1123334");
		Publisher publisher = new Publisher("Techmax", "India");
		
		publisherRepository.save(publisher);
		
		prashant.getBooks().add(dmuu);
		dmuu.getAuthors().add(prashant);
		dmuu.setPublisher(publisher);
		publisher.getBooks().add(dmuu);
		
		authorRepository.save(prashant);
		bookRepository.save(dmuu);
		publisherRepository.save(publisher);
		
		Author john = new Author("John", "Miller");
		Book dbms = new Book("Database Management Systems","1678334");
		john.getBooks().add(dbms);
		dbms.getAuthors().add(john);
		
		dbms.setPublisher(publisher);
		publisher.getBooks().add(dbms);
		
		authorRepository.save(john);
		bookRepository.save(dbms);
		publisherRepository.save (publisher);
		
		
		System.out.println("Started  in Bootstrap");
		System.out.println("Number of Books: " + bookRepository.count());
		System.out.println("Publisher count: "+ publisherRepository.count());
		System.out.println("Publishers Number of books : "+ publisher.getBooks().size());
		
	}
}

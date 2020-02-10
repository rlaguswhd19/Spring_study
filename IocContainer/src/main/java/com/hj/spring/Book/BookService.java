package com.hj.spring.Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
//	@Autowired
//	BookRepository bookRepository;
	
	@Autowired
	List<BookRepository> bookRepositories;
	
	public void printBookRepository() {
		this.bookRepositories.forEach(System.out::println);
	}
}	

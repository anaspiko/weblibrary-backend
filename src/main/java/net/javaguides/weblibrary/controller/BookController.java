package net.javaguides.weblibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.weblibrary.model.Book;
import net.javaguides.weblibrary.repository.BookRepository;

@RestController
@RequestMapping("/api/v1/")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	//get all books 
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
		
	}
}
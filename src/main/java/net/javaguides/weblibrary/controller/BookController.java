package net.javaguides.weblibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.weblibrary.exception.ResourceNotFoundException;
import net.javaguides.weblibrary.model.Book;
import net.javaguides.weblibrary.repository.BookRepository;

@CrossOrigin(origins = "http://localhost:4200")
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
	
	//create book rest api
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	//get book by id rest api
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id) {
		
		Book book = bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id:" + id));
		return ResponseEntity.ok(book);		
	}
	
	//update book rest api
	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Long id,@RequestBody Book book) {
		Book book = bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist id:" + id))
	}
}
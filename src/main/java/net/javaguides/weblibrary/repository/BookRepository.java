package net.javaguides.weblibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.weblibrary.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
}

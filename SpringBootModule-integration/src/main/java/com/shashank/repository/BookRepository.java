package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashank.hib.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	public Book getBookByBookName(String bookName);
}

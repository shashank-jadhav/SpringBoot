package com.shashank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.shashank.hib.model.Book;
import com.shashank.repository.BookRepository;
import com.shashank.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public String getHelloWorldString() {

		return "I am Best !!!";
	}

	@Autowired
	private BookRepository bookRepository;

	@Override
	@Transactional
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Long saveBook(Book book) {
		return bookRepository.save(book).getBookId();
	}

	@Override
	public Book getSingleBook(Long bookId) {
		/*return bookRepository.findById(bookId)
				.orElseThrow(() -> new RunTimeExcpetion("Supplied id : " + bookId + " is invalid."));*/
		
		return bookRepository.findById(bookId).get();
	}

	@Override
	public Book getBookByBookName(String bookName) {
		return bookRepository.getBookByBookName(bookName);
	}

}

package com.demo.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.exceptions.ServiceException;
import com.demo.ecommerce.model.AuthenticationBean;
import com.demo.ecommerce.model.Book;
import com.demo.ecommerce.model.Image;
import com.demo.ecommerce.service.BooksService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "books")
public class BooksController {

	@Autowired
	private BooksService booksService;

	@GetMapping("/getAllBooks")
	public Book[] getAllBooks() throws ServiceException {
		try {
			Book[] books = booksService.getAllBooks();
			return books;
		} catch (Exception e) {
			throw new ServiceException("No books found");
		}
	}

	@GetMapping("/getAllImages")
	public Image[] getAllImages() throws ServiceException {
		try {
			Image[] images = booksService.getAllImages();
			return images;
		} catch (Exception e) {
			throw new ServiceException("No Images found");
		}
	}

	@GetMapping(path = "/basicauth")
	public AuthenticationBean basicauth() {
		return new AuthenticationBean("You are authenticated");
	}

	@GetMapping(path = "/test")
	public String test() throws ServiceException {
		throw new ServiceException("No books found");
	}

}

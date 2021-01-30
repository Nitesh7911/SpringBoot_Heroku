package com.demo.ecommerce.service;

import org.springframework.stereotype.Service;

import com.demo.ecommerce.model.Book;
import com.demo.ecommerce.model.Image;


@Service
public interface BooksService {

	public Book[] getAllBooks();
	public Image[] getAllImages();
}

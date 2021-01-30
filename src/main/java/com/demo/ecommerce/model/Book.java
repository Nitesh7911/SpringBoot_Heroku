package com.demo.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book implements Comparable<Book>{

	/*
	 * { "bookID": 1, "title":
	 * "Harry Potter and the Half-Blood Prince (Harry Potter  #6)", "authors":
	 * "J.K. Rowling-Mary GrandPré", "average_rating": 4.56, "isbn": 439785960,
	 * "language_code": "eng", "ratings_count": 1944099, "price": 230 }
	 */
	
	@Id
	private Long bookID;

	private String title;

	private String authors;

	private String average_rating; // should be double

	private String isbn;

	private String language_code;

	private String ratings_count; // should be long

	private double price;

	public Long getBookID() {
		return bookID;
	}

	public void setBookID(Long bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getAverage_rating() {
		return average_rating;
	}

	public void setAverage_rating(String average_rating) {
		this.average_rating = average_rating;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getLanguage_code() {
		return language_code;
	}

	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}

	public String getRatings_count() {
		return ratings_count;
	}

	public void setRatings_count(String ratings_count) {
		this.ratings_count = ratings_count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", authors=" + authors + ", average_rating="
				+ average_rating + ", isbn=" + isbn + ", language_code=" + language_code + ", ratings_count="
				+ ratings_count + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		 if (this.price != o.getPrice()) {
	            return (int)this.price - (int)o.getPrice();
	        }
	        return this.title.compareTo(o.getTitle());
	    }

}

package com.demo.ecommerce.service.impl;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.ecommerce.model.Book;
import com.demo.ecommerce.model.Image;
import com.demo.ecommerce.service.BooksService;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class BooksServiceImpl implements BooksService{

	private RestTemplate restTemplate=new RestTemplate();

    public void RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    
	@Override
//	@HystrixCommand(fallbackMethod = "getAllBooks_Fallback")
	public Book[] getAllBooks() {
		// TODO Auto-generated method stub
		String url = "https://s3-ap-southeast-1.amazonaws.com/he-public-data/books8f8fe52.json";
        return this.restTemplate.getForObject(url, Book[].class);
	}

	@Override
	public Image[] getAllImages() {
		// TODO Auto-generated method stub
		String urlImages="https://s3-ap-southeast-1.amazonaws.com/he-public-data/bookimage816b123.json";
		return this.restTemplate.getForObject(urlImages, Image[].class);
	}
	
//	@SuppressWarnings("unused")
//	public Book[] getAllBooks_Fallback() {
//		System.out.println("Book Service is down!!! fallback route enabled...");
//		Book[] books =new Book[1];
//		System.out.println("CIRCUIT BREAKER ENABLED!!!No Response From Book Service at this moment. Service will be back shortly");
//		return books;
//	}

}

package com.demo.ecommerce.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.demo.ecommerce.model.Book;

@Repository
public interface BooksRepository extends CrudRepository<Book, Long> {

}

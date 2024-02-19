package com.Jenol.bookservice.repository;

import com.Jenol.bookservice.model.Book;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    // Autowired field for DynamoDBMapper to interact with DynamoDB.
    @Autowired
    private DynamoDBMapper mapper;

    // Method to save a book entity into the DynamoDB table.
    public void saveBook(final Book book) {
        mapper.save(book);
    }

    // Method to retrieve a book entity from the DynamoDB table by its bookId.
    public Book getBookByBookId(final String bookId) {
        final Book book = mapper.load(Book.class, bookId);
        return book;
    }

    // Method to update a book entity in the DynamoDB table.
    public void updateBook(final Book book) {
        saveBook(book); // Reusing saveBook method to update the book.
    }

    // Method to delete a book entity from the DynamoDB table by its bookId.
    public void deleteBookByBookId(final String bookId) {
        Book book = new Book();
        book.setBookId(bookId);
        mapper.delete(book);
    }

    // Method to retrieve all book entities from the DynamoDB table.
    public List<Book> getAllBooks() {
        // Scan the DynamoDB table and return a list of all book entities.
        List<Book> bookList = mapper.scan(Book.class, new DynamoDBScanExpression());
        return bookList;
    }
}

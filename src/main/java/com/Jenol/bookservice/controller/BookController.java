package com.Jenol.bookservice.controller;

import com.Jenol.bookservice.model.Book;
import com.Jenol.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    // Autowired field for BookRepository to handle book-related operations.
    @Autowired
    private BookRepository bookRepository;

    // Endpoint to retrieve all books.
    @GetMapping(value = "/books")
    public List<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }

    // Endpoint to retrieve a book by its ID.
    @GetMapping(value = "/books/{bookId}")
    public Book getBookById(@PathVariable("bookId")String bookId){
        return bookRepository.getBookByBookId(bookId);
    }

    // Endpoint to save a new book.
    @PostMapping(value = "/books")
    public void saveBook(@RequestBody Book book){
        bookRepository.saveBook(book);
    }

    // Endpoint to update an existing book.
    @PutMapping(value = "/books")
    public void updateBook(@RequestBody Book book){
        bookRepository.updateBook(book);
    }

    // Endpoint to delete a book by its ID.
    @DeleteMapping(value = "/books/{bookId}")
    public void deleteBook(@PathVariable("bookId")String bookId){
        bookRepository.deleteBookByBookId(bookId);
    }
}

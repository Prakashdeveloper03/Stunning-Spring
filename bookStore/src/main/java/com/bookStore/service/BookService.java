package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

/**
 * Service class for handling operations related to books.
 */
@Service
public class BookService {
    
    @Autowired
    private BookRepository bRepo;
    
    /**
     * Save a book.
     * 
     * @param b The book to be saved.
     */
    public void save(Book b) {
        bRepo.save(b);
    }
    
    /**
     * Retrieve all books.
     * 
     * @return List of all books.
     */
    public List<Book> getAllBook(){
        return bRepo.findAll();
    }
    
    /**
     * Retrieve a book by its ID.
     * 
     * @param id The ID of the book to retrieve.
     * @return The book with the specified ID.
     */
    public Book getBookById(int id) {
        return bRepo.findById(id).get();
    }
    
    /**
     * Delete a book by its ID.
     * 
     * @param id The ID of the book to delete.
     */
    public void deleteById(int id) {
        bRepo.deleteById(id);
    }
}
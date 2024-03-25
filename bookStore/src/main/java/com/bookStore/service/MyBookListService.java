package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;

/**
 * Service class for handling operations related to user's book list.
 */
@Service
public class MyBookListService {
    
    @Autowired
    private MyBookRepository mybook;
    
    /**
     * Save a book to user's book list.
     * 
     * @param book The book to be saved.
     */
    public void saveMyBooks(MyBookList book) {
        mybook.save(book);
    }
    
    /**
     * Retrieve all books from user's book list.
     * 
     * @return List of all books in user's book list.
     */
    public List<MyBookList> getAllMyBooks(){
        return mybook.findAll();
    }
    
    /**
     * Delete a book from user's book list by its ID.
     * 
     * @param id The ID of the book to delete.
     */
    public void deleteById(int id) {
        mybook.deleteById(id);
    }
}
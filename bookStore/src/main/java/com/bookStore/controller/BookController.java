package com.bookStore.controller;

import com.bookStore.entity.Book;
import com.bookStore.entity.MyBookList;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/** Controller class for handling book-related operations. */
@Controller
public class BookController {

  @Autowired private BookService service;

  @Autowired private MyBookListService myBookService;

  /**
   * Display home page.
   *
   * @return String representing the view name for the home page.
   */
  @GetMapping("/")
  public String home() {
    return "home";
  }

  /**
   * Display book registration page.
   *
   * @return String representing the view name for the book registration page.
   */
  @GetMapping("/book_register")
  public String bookRegister() {
    return "bookRegister";
  }

  /**
   * Retrieve all available books.
   *
   * @return ModelAndView containing the view name and list of books.
   */
  @GetMapping("/available_books")
  public ModelAndView getAllBook() {
    List<Book> list = service.getAllBook();
    return new ModelAndView("bookList", "book", list);
  }

  /**
   * Add a new book.
   *
   * @param b The book to be added.
   * @return String representing the redirection to available books page.
   */
  @PostMapping("/save")
  public String addBook(@ModelAttribute Book b) {
    service.save(b);
    return "redirect:/available_books";
  }

  /**
   * Display user's books.
   *
   * @param model Model object to add attributes for view rendering.
   * @return String representing the view name for the user's books page.
   */
  @GetMapping("/my_books")
  public String getMyBooks(Model model) {
    List<MyBookList> list = myBookService.getAllMyBooks();
    model.addAttribute("book", list);
    return "myBooks";
  }

  /**
   * Add a book to user's list.
   *
   * @param id The ID of the book to be added to user's list.
   * @return String representing the redirection to user's books page.
   */
  @RequestMapping("/mylist/{id}")
  public String getMyList(@PathVariable("id") int id) {
    Book b = service.getBookById(id);
    MyBookList mb = new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
    myBookService.saveMyBooks(mb);
    return "redirect:/my_books";
  }

  /**
   * Display book edit page.
   *
   * @param id The ID of the book to be edited.
   * @param model Model object to add attributes for view rendering.
   * @return String representing the view name for the book edit page.
   */
  @RequestMapping("/editBook/{id}")
  public String editBook(@PathVariable("id") int id, Model model) {
    Book b = service.getBookById(id);
    model.addAttribute("book", b);
    return "bookEdit";
  }

  /**
   * Delete a book.
   *
   * @param id The ID of the book to be deleted.
   * @return String representing the redirection to available books page.
   */
  @RequestMapping("/deleteBook/{id}")
  public String deleteBook(@PathVariable("id") int id) {
    service.deleteById(id);
    return "redirect:/available_books";
  }
}

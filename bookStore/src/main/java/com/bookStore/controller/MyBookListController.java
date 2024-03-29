package com.bookStore.controller;

import com.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/** Controller class for handling operations related to user's book list. */
@Controller
public class MyBookListController {

  @Autowired private MyBookListService service;

  /**
   * Delete a book from user's list.
   *
   * @param id The ID of the book to be deleted from user's list.
   * @return String representing the redirection to user's books page.
   */
  @RequestMapping("/deleteMyList/{id}")
  public String deleteMyList(@PathVariable("id") int id) {
    service.deleteById(id);
    return "redirect:/my_books";
  }
}

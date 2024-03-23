package com.bookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** Entity class representing a book in user's book list. */
@Entity
@Table(name = "MyBooks")
public class MyBookList {

  @Id private int id;
  private String name;
  private String author;
  private String price;

  /** Default constructor for MyBookList class. */
  public MyBookList() {
    super();
  }

  /**
   * Constructs a book in user's book list with specified id, name, author, and price.
   *
   * @param id The ID of the book.
   * @param name The name of the book.
   * @param author The author of the book.
   * @param price The price of the book.
   */
  public MyBookList(int id, String name, String author, String price) {
    super();
    this.id = id;
    this.name = name;
    this.author = author;
    this.price = price;
  }

  /**
   * Get the ID of the book in user's book list.
   *
   * @return The ID of the book.
   */
  public int getId() {
    return id;
  }

  /**
   * Set the ID of the book in user's book list.
   *
   * @param id The ID of the book.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Get the name of the book in user's book list.
   *
   * @return The name of the book.
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name of the book in user's book list.
   *
   * @param name The name of the book.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the author of the book in user's book list.
   *
   * @return The author of the book.
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Set the author of the book in user's book list.
   *
   * @param author The author of the book.
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Get the price of the book in user's book list.
   *
   * @return The price of the book.
   */
  public String getPrice() {
    return price;
  }

  /**
   * Set the price of the book in user's book list.
   *
   * @param price The price of the book.
   */
  public void setPrice(String price) {
    this.price = price;
  }
}

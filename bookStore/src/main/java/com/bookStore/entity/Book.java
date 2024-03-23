package com.bookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/** Entity class representing a book. */
@Entity
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private String author;
  private String price;

  /**
   * Constructs a book with specified id, name, author, and price.
   *
   * @param id The ID of the book.
   * @param name The name of the book.
   * @param author The author of the book.
   * @param price The price of the book.
   */
  public Book(int id, String name, String author, String price) {
    super();
    this.id = id;
    this.name = name;
    this.author = author;
    this.price = price;
  }

  /** Default constructor for Book class. */
  public Book() {
    super();
  }

  /**
   * Get the ID of the book.
   *
   * @return The ID of the book.
   */
  public int getId() {
    return id;
  }

  /**
   * Set the ID of the book.
   *
   * @param id The ID of the book.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Get the name of the book.
   *
   * @return The name of the book.
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name of the book.
   *
   * @param name The name of the book.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the author of the book.
   *
   * @return The author of the book.
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Set the author of the book.
   *
   * @param author The author of the book.
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Get the price of the book.
   *
   * @return The price of the book.
   */
  public String getPrice() {
    return price;
  }

  /**
   * Set the price of the book.
   *
   * @param price The price of the book.
   */
  public void setPrice(String price) {
    this.price = price;
  }
}

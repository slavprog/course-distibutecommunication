package com.course.distributecommunication.frontend.model;

import java.util.List;

public class AuthorsAndBooksDto {

  List<AuthorDto> authors;
  List<BookDto> books;

  public AuthorsAndBooksDto(List<AuthorDto> authors,
      List<BookDto> books) {
    this.authors = authors;
    this.books = books;
  }

  public List<AuthorDto> getAuthors() {
    return authors;
  }

  public void setAuthors(List<AuthorDto> authors) {
    this.authors = authors;
  }

  public List<BookDto> getBooks() {
    return books;
  }

  public void setBooks(List<BookDto> books) {
    this.books = books;
  }
}

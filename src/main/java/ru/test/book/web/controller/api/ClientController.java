package ru.test.book.web.controller.api;

import ru.test.book.models.Book;

import java.util.List;

public interface ClientController {
    List<Book> getAll();
    List<Book> getById(String id);
    List<Book> getByName(String name);
    List<Book> getByPrice(Double from, Double before);
}

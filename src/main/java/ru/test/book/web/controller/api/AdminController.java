package ru.test.book.web.controller.api;

import ru.test.book.models.Book;

public interface AdminController {
    void put(Book book);
    void edit(Book book);
    void delete(String id);
}

package ru.test.book.db.api;

import ru.test.book.models.Book;

public interface AdminDao {
    void put(Book book);
    void edit(Book book);
    void delete(String id);
}

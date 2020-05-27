package ru.test.book.web.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.test.book.db.api.AdminDao;
import ru.test.book.models.Book;
import ru.test.book.web.controller.api.AdminController;

@Component
public class AdminControllerImpl implements AdminController {

    @Autowired
    private AdminDao dao;

    @Override
    public void put(Book book) {
        dao.put(book);
    }

    @Override
    public void edit(Book book) {
        dao.edit(book);
    }

    @Override
    public void delete(String id) {
        dao.delete(id);
    }
}

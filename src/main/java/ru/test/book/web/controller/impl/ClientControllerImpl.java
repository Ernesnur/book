package ru.test.book.web.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.test.book.db.api.ClientDao;
import ru.test.book.models.Book;
import ru.test.book.web.controller.api.ClientController;

import java.util.List;

@Component
public class ClientControllerImpl implements ClientController {

    @Autowired
    private ClientDao clientDao;

    @Override
    public List<Book> getAll() {
        return clientDao.getAll();
    }

    @Override
    public List<Book> getById(String id) {
        return clientDao.getById(id);
    }

    @Override
    public List<Book> getByName(String name) {
        return clientDao.getByName(name);
    }

    @Override
    public List<Book> getByPrice(Double from, Double before) {
        return clientDao.getByPrice(from,before);
    }
}

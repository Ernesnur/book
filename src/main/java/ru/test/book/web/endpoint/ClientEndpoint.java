package ru.test.book.web.endpoint;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.book.models.Book;
import ru.test.book.web.controller.api.ClientController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ClientEndpoint {

    @Autowired
    private ClientController controller;

    @ApiOperation(value = "Дать книгу по id")
    @GetMapping("/getById/{id}")
    public List<Book> getBookById(@PathVariable String id) {
        return controller.getById(id);
    }

    @ApiOperation(value = "Дать книгу по Названию")
    @GetMapping("/getByName/{name}")
    public List<Book> getBookByName(@PathVariable String name) {
        return controller.getByName(name);
    }

    @ApiOperation(value = "Дать книги по цене")
    @GetMapping("/getByPrice/{from}&{before}")
    public List<Book> getBookByPrice(@PathVariable Double from, @PathVariable Double before) {
        return controller.getByPrice(from, before);
    }

    @ApiOperation(value = "Дать все книги")
    @GetMapping("/getAll")
    public List<Book> getAll() {
        return controller.getAll();
    }
}

package ru.test.book.web.endpoint;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.test.book.models.Book;
import ru.test.book.web.controller.api.AdminController;

@RestController
@RequestMapping("/rest/admin")
public class AdminEndpoint {

    @Autowired
    private AdminController controller;

    @PostMapping("/put")
    @ApiOperation(value = "Записать книгу")
    private void putBook(@RequestBody Book book) {
        controller.put(book);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "Удалить книгу")
    private void deleteBook(String id) {
        controller.delete(id);
    }

    @PostMapping("/edit")
    @ApiOperation(value = "Изменить книгу")
    private void editBook(@RequestBody Book book) {
        controller.edit(book);
    }

}

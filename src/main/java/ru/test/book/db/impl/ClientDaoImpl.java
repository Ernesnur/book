package ru.test.book.db.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.test.book.db.api.ClientDao;
import ru.test.book.db.mapper.BookRowMapper;
import ru.test.book.models.Book;

import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {
    private final String SELECT_QUERY = "select * from book ";
    private final String WHERE_PRICE = "where price BETWEEN ? AND ?";
    private final String WHERE_NAME = "where name = ?";
    private final String WHERE_ID = "where book_id = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Book> getAll() {
        return jdbcTemplate.query(SELECT_QUERY, new BookRowMapper());
    }

    @Override
    public List<Book> getById(String id) {
        return jdbcTemplate.query(SELECT_QUERY + WHERE_ID, new BookRowMapper(), id);
    }

    @Override
    public List<Book> getByName(String name) {
        return jdbcTemplate.query(SELECT_QUERY + WHERE_NAME, new BookRowMapper(), name);
    }

    @Override
    public List<Book> getByPrice(Double from, Double before) {
        return jdbcTemplate.query(SELECT_QUERY + WHERE_PRICE, new BookRowMapper(), from, before);
    }
}

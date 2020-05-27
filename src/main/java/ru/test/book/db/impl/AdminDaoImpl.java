package ru.test.book.db.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.test.book.db.api.AdminDao;
import ru.test.book.models.Book;

@Repository
public class AdminDaoImpl implements AdminDao {
    private final String INSERT_QUERY = "insert into book (BOOK_ID, NAME, AUTHOR, EDITOR, PUBLISHER, BOOK_YEAR, BOOK_WEIGHT, RATING, ABOUT, PRICE) " +
            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String UPDATE_QUERY = "update book set BOOK_ID = ?, NAME = ?, AUTHOR = ?, EDITOR = ?, PUBLISHER = ?, BOOK_YEAR = ?, BOOK_WEIGHT = ?, RATING = ?, ABOUT = ?, PRICE = ? " +
            "where BOOK_ID = ?";
    private final String DELETE_QUERY = "delete from book where BOOK_ID = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void put(Book book) {
        jdbcTemplate.update(INSERT_QUERY, book.getId(), book.getName(), book.getAuthor(), book.getEditor(), book.getPublisher(),
                book.getYear(), book.getWeight(), book.getRating(), book.getAbout(), book.getPrice());
    }

    @Override
    public void edit(Book book) {
        jdbcTemplate.update(UPDATE_QUERY, book.getId(), book.getName(), book.getAuthor(), book.getEditor(), book.getPublisher(),
                book.getYear(), book.getWeight(), book.getRating(), book.getAbout(), book.getPrice(), book.getId());
    }

    @Override
    public void delete(String id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }
}

package ru.test.book.db.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.test.book.models.Book;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int i) throws SQLException {
        Book book = new Book();
        book.setId(rs.getString("BOOK_ID"));
        book.setName(rs.getString("NAME"));
        book.setAuthor(rs.getString("AUTHOR"));
        book.setEditor(rs.getString("EDITOR"));
        book.setPublisher(rs.getString("PUBLISHER"));
        book.setYear(rs.getInt("BOOK_YEAR"));
        book.setWeight(rs.getInt("BOOK_WEIGHT"));
        book.setRating(rs.getDouble("RATING"));
        book.setAbout(rs.getString("ABOUT"));
        book.setPrice(rs.getDouble("PRICE"));
        return book;
    }
}

package pl.brenna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pl.brenna.model.Book;
import pl.brenna.util.ConnectionProvider;
import pl.brenna.util.DbOperationException;

public class MysqlBookDao implements BookDao{

	private final static String CREATE = "INSERT INTO book(isbn, title, description) VALUES(?, ?, ?);";
    private final static String READ = "SELECT isbn, title, description FROM book WHERE isbn = ?;";
    private final static String UPDATE = "UPDATE book SET isbn=?, title=?, description=? WHERE isbn = ?;";
    private final static String DELETE = "DELETE FROM book WHERE isbn=?;";

    public void create(Book book) {
        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement(CREATE)) {
            prepStmt.setString(1, book.getIsbn());
            prepStmt.setString(2, book.getTitle());
            prepStmt.setString(3, book.getDescription());
            prepStmt.executeUpdate();
        } catch(SQLException e) {
        	throw new DbOperationException(e);
        }
    }

    public Book read(String isbn) {
        Book resultBook = null;
        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement(READ);) {
            prepStmt.setString(1, isbn);
            ResultSet resultSet = prepStmt.executeQuery();
            if (resultSet.next()) {
                resultBook = new Book();
                resultBook.setIsbn(resultSet.getString("isbn"));
                resultBook.setTitle(resultSet.getString("title"));
                resultBook.setDescription(resultSet.getString("description"));
            }
        } catch(SQLException e) {
        	throw new DbOperationException(e);
        }
        return resultBook;
    }

    public void update(Book book){
        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement(UPDATE);) {
            prepStmt.setString(1, book.getIsbn());
            prepStmt.setString(2, book.getTitle());
            prepStmt.setString(3, book.getDescription());
            prepStmt.setString(4, book.getIsbn());
            prepStmt.executeUpdate();
        } catch(SQLException e) {
        	throw new DbOperationException(e);
        }
    }

    public void delete(Book book){
        try (Connection conn = ConnectionProvider.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement(DELETE);) {
            prepStmt.setString(1, book.getIsbn());
            prepStmt.executeUpdate();
        } catch(SQLException e) {
        	throw new DbOperationException(e);
        }
    }
    

}

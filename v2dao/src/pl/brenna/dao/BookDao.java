package pl.brenna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pl.brenna.model.Book;
import pl.brenna.util.ConnectionProvider;


public interface BookDao {

	public void create(Book book);
	
	public Book read(String isbn);
	
	public void update(Book book);
	
	public void delete(Book book);
	
	
	
}


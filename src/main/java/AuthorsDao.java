import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao implements Authors{
    @Override
    public List<Author> all() {

        List<Author> authors = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.authors");

            while (rs.next()) {
                Author author = new Author(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"));
                authors.add(author);
            }

        } catch (SQLException sqle) {
            throw new RuntimeException("error", sqle);
        }

        return authors;
    }

    @Override
    public Author getAuthorById(long id) {
        Author author = null;

        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.authors WHERE id='" + id + "'");
            rs.next();
//            ^bc only 1 item in the set
            author = new Author(rs.getLong("id"), rs.getString("lastName"));
        } catch (SQLException sqle) {
            throw new RuntimeException("error connecting to db", sqle);
        }
        return author;
    }

    @Override
    public void insert(Author author) {
        String last_name = author.getLastName();
        String query = "INSERT INTO codeup_test_db.authors (last_name) VALUES ('" + last_name +
                "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();

            long key = rs.getLong(1);
            System.out.println("New insert key is : " + key);
        }catch (SQLException e) {
            throw new RuntimeException("Error connecting to db", e)
        }

    }

    private Connection connection;

//    public AuthorsDao() {
//        try {
//            DriverManager.registerDriver(new Driver());
//            Config config = new Config();
//            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
//
//        } catch (SQLException sqle) {
//            throw new RuntimeException("Error connecting to db", sqle);
//        }
//    }
    public AuthorsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword()
            );

        } catch (SQLException sqle) {
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }
}


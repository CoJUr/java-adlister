
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes{
    private Connection connection;

    public QuotesDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
//            Config config = new Config();
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword()
            );

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public QuotesDao() {
        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword()
            );

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Quote> all() {
        Authors authorsDao = DaoFactory.getAuthorsDao();
        List<Quote> quotes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
            while(rs.next()) {
                long author_id = rs.getLong("author_id");
                Author quoteAuthor = authorsDao.getAuthorById(author_id);

//                for (Author author: authors) {
//                    if (author.getId() == author_id) {
//                        //if author id matches, then quote author can be set to equal that author
//                        quoteAuthor = author;
//                        //now can add this to constructor
//                    }
//                } dont need the loop now since grabbing by the id directly
                Quote quote = new Quote(

                        rs.getLong("id"),
                        rs.getString("content"),
                        quoteAuthor

                );
                quotes.add(quote);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to db", e);
        }
        return quotes;
    }

    @Override
    public void insert(Quote quote) {

    }


}

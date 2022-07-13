//import models.Quote;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class QuotesDao {
//
//    private Connection connection = null;
//
//    public QuotesDao(Config config){
//
//        try{
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUser(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to database", e);
//        }
//    }
//
//
//    public List<Quote> all() {
//        List<Quote> quotes = new ArrayList<>();
//        String query = "SELECT * FROM quotes";
//
//        try {
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery(query);
//
//            while (rs.next()) {
//                quotes.add(
//                        new Quote(
//                                rs.getLong("id"),
//                                rs.getString("author"),
//                                rs.getString("quote")
//                        )
//                );
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return quotes;
//    }
//
//
//}
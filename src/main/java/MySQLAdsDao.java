import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }


    public MySQLAdsDao() {
    }

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db" +
                            "?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup");
        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the db", e);
            System.out.println("Error while connecting to db: " + e);
        }
    }


}

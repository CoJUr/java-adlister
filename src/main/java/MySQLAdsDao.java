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


//    public MySQLAdsDao() {
//    }

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the db", e);
            System.out.println("Error while connecting to db: " + e);
        }
    }
    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the db", e);
            System.out.println("Error while connecting to db: " + e);
        }
    }


}

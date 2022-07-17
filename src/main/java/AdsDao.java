import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdsDao implements Ads{

    private Connection connection;

    public AdsDao() {
        try{
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(config.getUrl(),config.getUser(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException("Error from AdsDao while connecting DB: " + e);
        }
    }

    @Override
    public List<Ad> all() {
        Users userDao = new UsersDao();
//        List<User> users = userDao.all();
//        ^not efficient algorithm for many records situation
        List<Ad> ads = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.ads");

//            loop thru results, creating ad objects. dont want empty constructor
            while (rs.next()) {
                long user_id = rs.getLong("user_id");
                User adUser = userDao.getUserById(user_id);
//                for (User user: users) {
//                    if (user.getId() == user_id) {
//                        adUser = us er;
//                    }
//                } dont need, inefficient, getUserById instead
                Ad ad = new Ad(rs.getLong("id"), adUser,
                        rs.getString("title"), rs.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException("error connecting to DB from AdsDao .all(): ", e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}

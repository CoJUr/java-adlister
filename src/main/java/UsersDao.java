import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDao implements Users{

    private Connection connection;

    public UsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
//            Config config = new Config();
            connection = DriverManager.getConnection(config.getUrl(),config.getUser(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException("Error while connecting to DB: " + e);
        }
    }public UsersDao() {
        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(config.getUrl(),config.getUser(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException("Error while connecting to DB: " + e);
        }
    }

    @Override
    public List<User> all() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.users");
            while (rs.next()) {
                User user = new User(
                rs.getLong("id"), rs.getString("username"),
                        rs.getString("email"), rs.getString("password"));
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error in List all() usersDao: ", e);
        }
        return users;
//        now ready to make servlet to call the DAO
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public User getUserById(long id) {
        User user = null;
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.users WHERE id='" + id + "'");
            rs.next();
//            only getting 1 match, no need to loop, just move to the 1st item
            user = new User(rs.getLong("id"), rs.getString("username"));
        } catch (SQLException e) {
            throw new RuntimeException("Exception connecting to db from getUserById", e);
        }
        return user;
    }
}

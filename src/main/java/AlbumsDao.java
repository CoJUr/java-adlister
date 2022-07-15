import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlbumsDao implements Albums{

    private Connection connection;

    public AlbumsDao() {
    try {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db" +
                        "?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup");
    } catch (SQLException e) {
        throw new RuntimeException("Error connecting to the db", e);
    }
    }

    @Override
    public List<Album> all() {
        List<Album> albums = new ArrayList<>();

        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM airbnb_db.Rooms");

            while (rs.next()) {
                Album album = new Album(rs.getLong("id"), rs.getString("street"), rs.getInt("owner_id"));
                albums.add(album);
            }

        } catch (SQLException sqle) {
            throw new RuntimeException("DB connection error", sqle);
        }
        return albums;

    }

    @Override
    public void insert(Album album) {

    }
}

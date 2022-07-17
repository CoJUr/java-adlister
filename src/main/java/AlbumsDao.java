import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlbumsDao implements Albums{

    private Connection connection;

    public AlbumsDao() {
    try {
        DriverManager.registerDriver(new Driver());
        Config config = new Config();
        connection = DriverManager.getConnection(config.getUrl(),
                config.getUser(),
                config.getPassword());
    } catch (SQLException e) {
        throw new RuntimeException("Error connecting to the db", e);
    }
    }

    @Override
    public List<Album> all() {
        List<Album> albums = new ArrayList<>();

        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.albums");

            while (rs.next()) {
                Album album = new Album(rs.getLong("id"), rs.getString("artist"), rs.getString("name"));
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

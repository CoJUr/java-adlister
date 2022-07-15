import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBClec {

    private static List<String> getAlbumNames() {
        List<String> albumNames = new ArrayList<>();
        try{

            //make connection
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            Connection connection = DriverManager.getConnection(config.getUrl(),
                    config.getUser(),
                    config.getPassword());

            //create statement obj
            Statement statement = connection.createStatement();

            //execute statement
            ResultSet rs = statement.executeQuery("SELECT street FROM airbnb_db.Rooms");
            while (rs.next()) {
                albumNames.add(rs.getString("street"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            //printstacktrace will show the exact line of the error occurring
        }
        return albumNames;
    }

    public static void main(String[] args) {

        List<String> albumNames = getAlbumNames();
        for (String albumName: albumNames) {
            System.out.println(albumName);
        }


    }
}

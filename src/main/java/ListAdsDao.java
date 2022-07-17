//import com.mysql.cj.jdbc.Driver;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListAdsDao implements Ads {
//    private Connection connection;
//    private List<Ad> ads;
//
//
//    public ListAdsDao(Config config) {
//        try{
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting db from ListAdsDao", e);
//        }
//    }
//    public ListAdsDao() {
//        try{
//            DriverManager.registerDriver(new Driver());
//            Config config = new Config();
//            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting db from ListAdsDao", e);
//        }
//    }
//
//    public List<Ad> all() {
//        if (ads == null) {
//            ads = generateAds();
//        }
//        return ads;
//    }
//
//    public Long insert(Ad ad) {
//        // make sure we have ads
//        if (ads == null) {
//            ads = generateAds();
//        }
//        // we'll assign an "id" here based on the size of the ads list
//        // really the database would handle this
//        ad.setId((long) ads.size());
//        ads.add(ad);
//        return ad.getId();
//    }
//
//    private List<Ad> generateAds() {
//        List<Ad> ads = new ArrayList<>();
//        ads.add(new Ad(
//            1,
//            1,
//            "playstation for sale",
//            "This is a slightly used playstation"
//        ));
//        ads.add(new Ad(
//            2,
//            1,
//            "Super Nintendo",
//            "Get your game on with this old-school classic!"
//        ));
//        ads.add(new Ad(
//            3,
//            2,
//            "Junior Java Developer Position",
//            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
//        ));
//        ads.add(new Ad(
//            4,
//            2,
//            "JavaScript Developer needed",
//            "Must have strong Java skills"
//        ));
//        return ads;
//    }
//}

public class DaoFactory {
    private static Ads adsDao;

    private static Authors authorsDao;

    private static Quotes quotesDao;
    private static Users usersDao;

    private static Ads listAdsDao;

    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao(config);
        }
        return adsDao;
    }
//    public static Ads getAdsDao(Config config) {
//        if (adsDao == null) {
//            adsDao = new ListAdsDao(config);
//        }
//        return adsDao;
//    }


//    public static Authors getAuthorsDao(Config config) {
//        if (authorsDao == null) {
//            authorsDao = new AuthorsDao(config);
//        }
//        return authorsDao;
//
//    }

    public static Authors getAuthorsDao() {
        if (authorsDao == null) {
            authorsDao = new AuthorsDao(config);
        }
        return authorsDao;

    }
//    public static Users getUsersDao(Config config) {
//        if (usersDao == null) {
//            usersDao = new UsersDao(config);
//        }
//        return usersDao;
//
//    }
    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new UsersDao(config);
        }
        return usersDao;

    }
//    public static Quotes getQuotesDao(Config config) {
//        if (quotesDao == null) {
//            quotesDao = new QuotesDao(config);
//        }
//        return quotesDao;
//
//    }
    public static Quotes getQuotesDao() {
        if (quotesDao == null) {
            quotesDao = new QuotesDao(config);
        }
        return quotesDao;

    }
    public static Ads getListAdsDao() {
        if (listAdsDao == null) {
            listAdsDao = new ListAdsDao(config);
        }
        return listAdsDao;

    }



}

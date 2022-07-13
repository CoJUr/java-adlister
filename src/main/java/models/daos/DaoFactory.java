package models.daos;

import models.Ads;

public class DaoFactory {

    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new AdsDao();
        }
        return adsDao;
    }
}

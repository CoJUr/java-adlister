package models.daos;

import models.Ad;
import models.Ads;

import java.util.List;

public class AdsDao implements Ads {

    List<Ads> ads = Ad.getAds();

    @Override
    public List<Ads> all() {
        return ads;
    }

    @Override
    public void insert(Ad ad) {

    }


}

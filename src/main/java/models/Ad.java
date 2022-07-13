package models;

import java.util.ArrayList;
import java.util.List;

public class Ad {

    private String name;
    private double price;

    private static List<Ads> ads = new ArrayList<>();

    public static void setAds(List<Ads> ads) {
        Ad.ads = ads;
    }

    public Ad() {};

    public Ad(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static List<Ads> getAds() {
        return ads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

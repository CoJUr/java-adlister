package models;

import java.util.List;

public interface Ads {

    List<Ads> all();

    void insert(Ad ad);

    public void create(Ad ad);

}

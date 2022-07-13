package models;

import java.util.List;

public interface Ads {

    List<Ads> all();

    void insert(Ad ad);

}

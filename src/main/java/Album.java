import java.io.Serializable;

public class Album implements Serializable {

    private long id;
    private String street;
    private int owner_id;

    public Album() {}

    public Album(long id, String street, int owner_id) {
        this.id = id;
        this.street = street;
        this.owner_id = owner_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }
}

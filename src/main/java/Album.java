import java.io.Serializable;

public class Album implements Serializable {

    private long id;
    private String artist;
    private String name;


    public Album() {}

    public Album(long id, String artist, String name) {
        this.id = id;
        this.artist = artist;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

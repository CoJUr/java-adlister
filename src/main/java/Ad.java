import java.io.Serializable;

public class Ad implements Serializable {
    private long id;
    private User user;
    private String title;
    private String description;

    public Ad() {}

    public Ad(long id, User user, String title, String description) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.description = description;
    }

    public Ad(User user, String title, String description) {
        this.user = user;
        this.title = title;
        this.description = description;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

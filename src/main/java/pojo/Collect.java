package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Collect implements Serializable {
    private int scid;

    private int uid;

    private int spid;

    private User user;

    private Product product;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }
}
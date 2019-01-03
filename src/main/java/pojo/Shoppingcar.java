package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Shoppingcar implements Serializable {
    private int scid;

    private int uid;

    private int spid;

    private int xiaoji;

    private int count;

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

    public int getXiaoji() {
        return xiaoji;
    }

    public void setXiaoji(int xiaoji) {
        this.xiaoji = xiaoji;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
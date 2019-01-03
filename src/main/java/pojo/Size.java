package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Size implements Serializable {
    private int prid;

    private int size;

    private int spcid;

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpcid() {
        return spcid;
    }

    public void setSpcid(int spcid) {
        this.spcid = spcid;
    }
}
package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ProductSizeKey implements Serializable {
    private int prid;

    private int spid;

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }
}
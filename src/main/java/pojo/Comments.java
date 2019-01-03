package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class Comments implements Serializable {
    private int scsid;

    private int scstype;

    private int uid;

    private int spid;

    private Date scdate;

    private String scconcent;

    private Product product;

    private User user;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScsid() {
        return scsid;
    }

    public void setScsid(int scsid) {
        this.scsid = scsid;
    }

    public int getScstype() {
        return scstype;
    }

    public void setScstype(int scstype) {
        this.scstype = scstype;
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

    public Date getScdate() {
        return scdate;
    }

    public void setScdate(Date scdate) {
        this.scdate = scdate;
    }

    public String getScconcent() {
        return scconcent;
    }

    public void setScconcent(String scconcent) {
        this.scconcent = scconcent;
    }
}
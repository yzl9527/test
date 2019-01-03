package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class Address implements Serializable {

    private int said;

    private String saname;

    private String sacode;

    private String provinceid;

    private String cityid;

    private String areaid;

    private String saaddress;

    private String saphone;

    private int imid;

    private Date created;

    private Date updated;

    private User user;

    private Set<Order> orderSet = new HashSet<Order>();

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSaid() {
        return said;
    }

    public void setSaid(int said) {
        this.said = said;
    }

    public String getSaname() {
        return saname;
    }

    public void setSaname(String saname) {
        this.saname = saname;
    }

    public String getSacode() {
        return sacode;
    }

    public void setSacode(String sacode) {
        this.sacode = sacode;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getSaaddress() {
        return saaddress;
    }

    public void setSaaddress(String saaddress) {
        this.saaddress = saaddress;
    }

    public String getSaphone() {
        return saphone;
    }

    public void setSaphone(String saphone) {
        this.saphone = saphone;
    }

    public int getImid() {
        return imid;
    }

    public void setImid(int imid) {
        this.imid = imid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
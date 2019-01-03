package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class ProductCategory implements Serializable {
    private int spcid;

    private String spcname;

    private int spcpaid;

    private int spcstatus;

    private Boolean isparent;

    private Date created;

    private Date updated;

    private Set<Product> products = new HashSet<Product>();

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public int getSpcid() {
        return spcid;
    }

    public void setSpcid(int spcid) {
        this.spcid = spcid;
    }

    public String getSpcname() {
        return spcname;
    }

    public void setSpcname(String spcname) {
        this.spcname = spcname;
    }

    public int getSpcpaid() {
        return spcpaid;
    }

    public void setSpcpaid(int spcpaid) {
        this.spcpaid = spcpaid;
    }

    public int getSpcstatus() {
        return spcstatus;
    }

    public void setSpcstatus(int spcstatus) {
        this.spcstatus = spcstatus;
    }

    public Boolean getIsparent() {
        return isparent;
    }

    public void setIsparent(Boolean isparent) {
        this.isparent = isparent;
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
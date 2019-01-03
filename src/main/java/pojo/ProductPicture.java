package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ProductPicture implements Serializable {
    private int sicid;

    private int spid;

    private String sicphoto;

    private int sicstatus;

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSicid() {
        return sicid;
    }

    public void setSicid(int sicid) {
        this.sicid = sicid;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public String getSicphoto() {
        return sicphoto;
    }

    public void setSicphoto(String sicphoto) {
        this.sicphoto = sicphoto;
    }

    public int getSicstatus() {
        return sicstatus;
    }

    public void setSicstatus(int sicstatus) {
        this.sicstatus = sicstatus;
    }
}
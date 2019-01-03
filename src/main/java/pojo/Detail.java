package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;

@Component
public class Detail implements Serializable {
    private int sodid;

    private String soid;

    private int spid;

    private int sodquantity;

    private BigDecimal sodcost;

    private Order order;

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getSodid() {
        return sodid;
    }

    public void setSodid(int sodid) {
        this.sodid = sodid;
    }

    public String getSoid() {
        return soid;
    }

    public void setSoid(String soid) {
        this.soid = soid;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public int getSodquantity() {
        return sodquantity;
    }

    public void setSodquantity(int sodquantity) {
        this.sodquantity = sodquantity;
    }

    public BigDecimal getSodcost() {
        return sodcost;
    }

    public void setSodcost(BigDecimal sodcost) {
        this.sodcost = sodcost;
    }
}
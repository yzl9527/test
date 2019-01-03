package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Component
public class Brand implements Serializable {
    private int bid;

    private String brand;

    private String sicphoto;

    private int spcid;

    private ProductCategory productCategory;

    private Set<ProductBrandKey> productBrandKeySet = new HashSet<ProductBrandKey>();

    public Set<ProductBrandKey> getProductBrandKeySet() {
        return productBrandKeySet;
    }

    public void setProductBrandKeySet(Set<ProductBrandKey> productBrandKeySet) {
        this.productBrandKeySet = productBrandKeySet;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSicphoto() {
        return sicphoto;
    }

    public void setSicphoto(String sicphoto) {
        this.sicphoto = sicphoto;
    }

    public int getSpcid() {
        return spcid;
    }

    public void setSpcid(int spcid) {
        this.spcid = spcid;
    }
}
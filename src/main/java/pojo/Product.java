package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Component
public class Product implements Serializable {
    private int spid;

    private String spname;

    private String spdescription;

    private int spcid;

    private BigDecimal price;

    private BigDecimal discount;

    private int spsell;

    private int spbid;

    private int spstate;

    private Date created;

    private Date updated;

    private Set<Collect> collectSet = new HashSet<Collect>();

    private ProductCategory productCategory;

    private Stock stock;

    private Set<ProductPicture> productPictures = new HashSet<ProductPicture>();

    private Set<Comments> commentsSet = new HashSet<Comments>();

    private Set<Detail> detailSet = new HashSet<Detail>();

    private Set<ProductBrandKey> productBrandKeys = new HashSet<ProductBrandKey>();

    private Set<ProductColorKey> productColorKeySet = new HashSet<ProductColorKey>();

    public Set<ProductColorKey> getProductColorKeySet() {
        return productColorKeySet;
    }

    public void setProductColorKeySet(Set<ProductColorKey> productColorKeySet) {
        this.productColorKeySet = productColorKeySet;
    }

    public Set<ProductBrandKey> getProductBrandKeys() {
        return productBrandKeys;
    }

    public void setProductBrandKeys(Set<ProductBrandKey> productBrandKeys) {
        this.productBrandKeys = productBrandKeys;
    }

    public Set<Detail> getDetailSet() {
        return detailSet;
    }

    public void setDetailSet(Set<Detail> detailSet) {
        this.detailSet = detailSet;
    }

    public Set<Comments> getCommentsSet() {
        return commentsSet;
    }

    public void setCommentsSet(Set<Comments> commentsSet) {
        this.commentsSet = commentsSet;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Set<ProductPicture> getProductPictures() {
        return productPictures;
    }

    public void setProductPictures(Set<ProductPicture> productPictures) {
        this.productPictures = productPictures;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Set<Collect> getCollectSet() {
        return collectSet;
    }

    public void setCollectSet(Set<Collect> collectSet) {
        this.collectSet = collectSet;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public String getSpdescription() {
        return spdescription;
    }

    public void setSpdescription(String spdescription) {
        this.spdescription = spdescription;
    }

    public int getSpcid() {
        return spcid;
    }

    public void setSpcid(int spcid) {
        this.spcid = spcid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public int getSpsell() {
        return spsell;
    }

    public void setSpsell(int spsell) {
        this.spsell = spsell;
    }

    public int getSpbid() {
        return spbid;
    }

    public void setSpbid(int spbid) {
        this.spbid = spbid;
    }

    public int getSpstate() {
        return spstate;
    }

    public void setSpstate(int spstate) {
        this.spstate = spstate;
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
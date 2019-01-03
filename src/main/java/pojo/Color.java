package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Component
public class Color implements Serializable {
    private int crid;

    private int color;

    private Set<ProductColorKey> productColorKeys = new HashSet<ProductColorKey>();

    public Set<ProductColorKey> getProductColorKeys() {
        return productColorKeys;
    }

    public void setProductColorKeys(Set<ProductColorKey> productColorKeys) {
        this.productColorKeys = productColorKeys;
    }

    public int getCrid() {
        return crid;
    }

    public void setCrid(int crid) {
        this.crid = crid;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ProductBusiness implements Serializable {
    private int spbid;

    private String spbname;

    private int spbage;

    private String spbusername;

    private String spbaddress;

    private int spbtelephone;

    private String spbpictures;

    public int getSpbid() {
        return spbid;
    }

    public void setSpbid(int spbid) {
        this.spbid = spbid;
    }

    public String getSpbname() {
        return spbname;
    }

    public void setSpbname(String spbname) {
        this.spbname = spbname;
    }

    public int getSpbage() {
        return spbage;
    }

    public void setSpbage(int spbage) {
        this.spbage = spbage;
    }

    public String getSpbusername() {
        return spbusername;
    }

    public void setSpbusername(String spbusername) {
        this.spbusername = spbusername;
    }

    public String getSpbaddress() {
        return spbaddress;
    }

    public void setSpbaddress(String spbaddress) {
        this.spbaddress = spbaddress;
    }

    public int getSpbtelephone() {
        return spbtelephone;
    }

    public void setSpbtelephone(int spbtelephone) {
        this.spbtelephone = spbtelephone;
    }

    public String getSpbpictures() {
        return spbpictures;
    }

    public void setSpbpictures(String spbpictures) {
        this.spbpictures = spbpictures;
    }
}
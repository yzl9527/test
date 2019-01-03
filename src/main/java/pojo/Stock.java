package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class Stock implements Serializable {
    private int ssid;

    private int spid;

    private int ssnumber;

    private Date ssdate;

    private int ssaddnumber;

    private Date ssaddtime;

    private Product product;

    public int getSsid() {
        return ssid;
    }

    public void setSsid(int ssid) {
        this.ssid = ssid;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public int getSsnumber() {
        return ssnumber;
    }

    public void setSsnumber(int ssnumber) {
        this.ssnumber = ssnumber;
    }

    public Date getSsdate() {
        return ssdate;
    }

    public void setSsdate(Date ssdate) {
        this.ssdate = ssdate;
    }

    public int getSsaddnumber() {
        return ssaddnumber;
    }

    public void setSsaddnumber(int ssaddnumber) {
        this.ssaddnumber = ssaddnumber;
    }

    public Date getSsaddtime() {
        return ssaddtime;
    }

    public void setSsaddtime(Date ssaddtime) {
        this.ssaddtime = ssaddtime;
    }
}
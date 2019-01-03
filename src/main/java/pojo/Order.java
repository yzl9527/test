package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class Order implements Serializable {
    private String soid;

    private int uid;

    private int said;

    private Date soctime;

    private Date soupdatetime;

    private Date sopaymenttime;

    private Date soconsigntime;

    private Date soendtime;

    private Date soclosetime;

    private int sostatus;

    private int sotype;

    private User user;

    private Address address;

    private Set<Detail> details = new HashSet<Detail>();

    public Set<Detail> getDetails() {
        return details;
    }

    public void setDetails(Set<Detail> details) {
        this.details = details;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSoid() {
        return soid;
    }

    public void setSoid(String soid) {
        this.soid = soid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSaid() {
        return said;
    }

    public void setSaid(int said) {
        this.said = said;
    }

    public Date getSoctime() {
        return soctime;
    }

    public void setSoctime(Date soctime) {
        this.soctime = soctime;
    }

    public Date getSoupdatetime() {
        return soupdatetime;
    }

    public void setSoupdatetime(Date soupdatetime) {
        this.soupdatetime = soupdatetime;
    }

    public Date getSopaymenttime() {
        return sopaymenttime;
    }

    public void setSopaymenttime(Date sopaymenttime) {
        this.sopaymenttime = sopaymenttime;
    }

    public Date getSoconsigntime() {
        return soconsigntime;
    }

    public void setSoconsigntime(Date soconsigntime) {
        this.soconsigntime = soconsigntime;
    }

    public Date getSoendtime() {
        return soendtime;
    }

    public void setSoendtime(Date soendtime) {
        this.soendtime = soendtime;
    }

    public Date getSoclosetime() {
        return soclosetime;
    }

    public void setSoclosetime(Date soclosetime) {
        this.soclosetime = soclosetime;
    }

    public int getSostatus() {
        return sostatus;
    }

    public void setSostatus(int sostatus) {
        this.sostatus = sostatus;
    }

    public int getSotype() {
        return sotype;
    }

    public void setSotype(int sotype) {
        this.sotype = sotype;
    }
}
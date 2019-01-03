package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Component
public class Cities implements Serializable {
    private int id;

    private String cityid;

    private String city;

    private String provinceid;

    private Provinces provinces;

    private Set<Areas> areas = new HashSet<Areas>();

    public Set<Areas> getAreas() {
        return areas;
    }

    public void setAreas(Set<Areas> areas) {
        this.areas = areas;
    }

    public Provinces getProvinces() {
        return provinces;
    }

    public void setProvinces(Provinces provinces) {
        this.provinces = provinces;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }
}
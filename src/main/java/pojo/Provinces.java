package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Component
public class Provinces implements Serializable {
    private int id;

    private String provinceid;

    private String province;

    private Set<Cities> cities = new HashSet<Cities>();

    public Set<Cities> getCities() {
        return cities;
    }

    public void setCities(Set<Cities> cities) {
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
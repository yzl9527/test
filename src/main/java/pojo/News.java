package pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class News implements Serializable {
    private int newid;

    private String newtitle;

    private String newcontent;

    private Date newcreatetime;

    public int getNewid() {
        return newid;
    }

    public void setNewid(int newid) {
        this.newid = newid;
    }

    public String getNewtitle() {
        return newtitle;
    }

    public void setNewtitle(String newtitle) {
        this.newtitle = newtitle;
    }

    public String getNewcontent() {
        return newcontent;
    }

    public void setNewcontent(String newcontent) {
        this.newcontent = newcontent;
    }

    public Date getNewcreatetime() {
        return newcreatetime;
    }

    public void setNewcreatetime(Date newcreatetime) {
        this.newcreatetime = newcreatetime;
    }
}
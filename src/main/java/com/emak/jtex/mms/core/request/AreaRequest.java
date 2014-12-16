package com.emak.jtex.mms.core.request;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Ramanath on 12/16/2014.
 */
@XmlRootElement
public class AreaRequest implements Serializable {

    private int id;
    private String name= "";

    public AreaRequest() {
        this.id = 0;
    }

    public AreaRequest(int id) {
        this.id = id;
    }

    public AreaRequest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void clear() {
        this.id = 0;
        this.name = "";
    }

}

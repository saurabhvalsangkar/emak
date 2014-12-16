package com.emak.jtex.mms.core.request;

import com.emak.jtex.mms.core.Area;
import com.emak.jtex.mms.core.Person;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Ramanath on 12/16/2014.
 */

@XmlRootElement
public class MyDayRequest {

    private int id;
    private int status;
    private Date date;
    private PersonRequest representative;
    private PersonRequest fieldOfficer;
    private String feedBack;
    private AreaRequest workingArea;

    public MyDayRequest() {
    }

    public MyDayRequest(int id, int status, Date date, PersonRequest representative, PersonRequest fieldOfficer, String feedBack, AreaRequest workingArea) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.representative = representative;
        this.fieldOfficer = fieldOfficer;
        this.feedBack = feedBack;
        this.workingArea = workingArea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PersonRequest getRepresentative() {
        return representative;
    }

    public void setRepresentative(PersonRequest representative) {
        this.representative = representative;
    }

    public PersonRequest getFieldOfficer() {
        return fieldOfficer;
    }

    public void setFieldOfficer(PersonRequest fieldOfficer) {
        this.fieldOfficer = fieldOfficer;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public AreaRequest getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(AreaRequest workingArea) {
        this.workingArea = workingArea;
    }
}

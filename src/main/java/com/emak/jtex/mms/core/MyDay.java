package com.emak.jtex.mms.core;

import java.util.Date;

public class MyDay {

	private int id;
	private int status;
	private java.util.Date date;
	private Person representative;
	private Person fieldOfficer;
	private String feedBack;
	private Area workingArea;

    @Override
    public String toString() {
        return "MyDay{" +
                "id=" + id +
                ", status=" + status +
                ", date=" + date +
                ", representative=" + representative +
                ", fieldOfficer=" + fieldOfficer +
                ", feedBack='" + feedBack + '\'' +
                ", workingArea=" + workingArea +
                '}';
    }

    public MyDay() {
		this.id = 0;
		this.status = 0;
		this.date = new Date(0);
		this.representative = new Person();
		this.fieldOfficer = new Person();
		this.feedBack = "";
		this.workingArea = new Area();
	}

	public MyDay(int id, int status, Date date, Person representative, Person fieldOfficer, String feedBack, Area workingArea) {
		super();
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

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public Person getRepresentative() {
		return representative;
	}

	public void setRepresentative(Person representative) {
		this.representative = representative;
	}

	public Person getFieldOfficer() {
		return fieldOfficer;
	}

	public void setFieldOfficer(Person fieldOfficer) {
		this.fieldOfficer = fieldOfficer;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	public Area getWorkingArea() {
		return workingArea;
	}

	public void setWorkingArea(Area workingArea) {
		this.workingArea = workingArea;
	}

	public void clear() {
		this.id = 0;
		this.status = 0;
		this.date.setTime(0);
		this.representative.clear();
		this.fieldOfficer.clear();
		this.feedBack = "";
		this.workingArea.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((feedBack == null) ? 0 : feedBack.hashCode());
		result = prime * result + ((fieldOfficer == null) ? 0 : fieldOfficer.hashCode());
		result = prime * result + id;
		result = prime * result + ((representative == null) ? 0 : representative.hashCode());
		result = prime * result + status;
		result = prime * result + ((workingArea == null) ? 0 : workingArea.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDay other = (MyDay) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (feedBack == null) {
			if (other.feedBack != null)
				return false;
		} else if (!feedBack.equals(other.feedBack))
			return false;
		if (fieldOfficer == null) {
			if (other.fieldOfficer != null)
				return false;
		} else if (!fieldOfficer.equals(other.fieldOfficer))
			return false;
		if (id != other.id)
			return false;
		if (representative == null) {
			if (other.representative != null)
				return false;
		} else if (!representative.equals(other.representative))
			return false;
		if (status != other.status)
			return false;
		if (workingArea == null) {
			if (other.workingArea != null)
				return false;
		} else if (!workingArea.equals(other.workingArea))
			return false;
		return true;
	}

	
}

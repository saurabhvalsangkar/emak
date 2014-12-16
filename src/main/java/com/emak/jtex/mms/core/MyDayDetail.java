package com.emak.jtex.mms.core;

import java.util.ArrayList;
import java.util.Date;

public class MyDayDetail {

	private int id;
	private Person retailer;
	private java.util.Date start;
	private java.util.Date end;
	private String feedBack;
	private ArrayList<Product> list;

	public MyDayDetail() {
		this.id = 0;
		this.retailer = new Person();
		this.feedBack = "";
		this.start = new Date(0);
		this.end = new Date(0);
		this.list = new ArrayList<Product>();
	}

	public MyDayDetail(int id, Person retailer, String feedBack) {
		super();
		this.id = id;
		this.retailer = retailer;
		this.feedBack = feedBack;
		this.start = new Date(0);
		this.end = new Date(0);
		this.list = new ArrayList<Product>();
	}

	public MyDayDetail(int id, Person retailer, Date start, Date end, String feedBack) {
		super();
		this.id = id;
		this.retailer = retailer;
		this.start = start;
		this.end = end;
		this.feedBack = feedBack;
	}

	public MyDayDetail(int id, Person retailer, String feedBack, ArrayList<Product> list) {
		super();
		this.id = id;
		this.retailer = retailer;
		this.feedBack = feedBack;
		this.start = new Date(0);
		this.end = new Date(0);
		this.list = list;
	}

	public MyDayDetail(int id, Person retailer, Date start, Date end, String feedBack, ArrayList<Product> list) {
		super();
		this.id = id;
		this.retailer = retailer;
		this.start = start;
		this.end = end;
		this.feedBack = feedBack;
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getRetailer() {
		return retailer;
	}

	public void setRetailer(Person retailer) {
		this.retailer = retailer;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	public java.util.Date getStart() {
		return start;
	}

	public void setStart(java.util.Date start) {
		this.start = start;
	}

	public java.util.Date getEnd() {
		return end;
	}

	public void setEnd(java.util.Date end) {
		this.end = end;
	}

	public ArrayList<Product> getList() {
		return list;
	}

	public void setList(ArrayList<Product> list) {
		this.list = list;
	}

	public void clear() {
		this.id = 0;
		this.retailer.clear();
		this.feedBack = "";
		this.start.setTime(0);
		this.end.setTime(0);
		this.list.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((feedBack == null) ? 0 : feedBack.hashCode());
		result = prime * result + id;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((retailer == null) ? 0 : retailer.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
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
		MyDayDetail other = (MyDayDetail) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (feedBack == null) {
			if (other.feedBack != null)
				return false;
		} else if (!feedBack.equals(other.feedBack))
			return false;
		if (id != other.id)
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (retailer == null) {
			if (other.retailer != null)
				return false;
		} else if (!retailer.equals(other.retailer))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

}

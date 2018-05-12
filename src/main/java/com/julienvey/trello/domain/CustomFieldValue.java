package com.julienvey.trello.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomFieldValue {

	private static DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

	private String text;
	private Float number;
	private Date date;
	private Boolean checked;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getNumber() {
		return Float.toString(number);
	}
	public void setNumber(String number) {
		try {
			this.number = Float.parseFloat(number);
		} catch(Exception e) {
			
		}
	}
	
	public String getDate() {
		return date == null ? null : date.toString();
	}
	public void setDate(String date) {
		try {
			this.date = formatter.parse(date);
		} catch(Exception e) {
			
		}
	}
	public String getChecked() {
		return checked ? "true":"false";
	}
	public void setChecked(String checked) {
		this.checked = "true".equals(checked);
	}
	
	@JsonIgnore
	public Class<?> getType() {
		if(text != null) return String.class;
		if(number != null) return Float.class;
		if(date != null) return Date.class;
		if(checked != null) return Boolean.class;
		return null;
	}
	
	// only one of them will have a value
	@JsonIgnore
	public Object getValue() {
		if(text != null) return text;
		if(number != null) return number;
		if(date != null) return date;
		if(checked != null) return checked;
		return null;
	}
	
}
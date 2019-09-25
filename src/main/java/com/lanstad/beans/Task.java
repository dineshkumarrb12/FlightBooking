package com.lanstad.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Task {
	private String name;
	private String milestone;
	private String type;
	private List<String> attribute;
	private String description;
	private Date startDate;
	private Date endDate;
	private String taskComplexity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMilestone() {
		return milestone;
	}
	public void setMilestone(String milestone) {
		this.milestone = milestone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getAttribute() {
		return attribute;
	}
	public void setAttribute(List<String> attribute) {
		this.attribute = attribute;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Date date = null;
		try {
			date = sdf.parse(startDate);
		} catch (ParseException e) {
		} //Parsers
		
		this.startDate = date;
	}
	
	
	public Date getEndDate() {
		return endDate;
	}
	
	
	public void setEndDate(String endDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Date date = null;
		try {
			date = sdf.parse(endDate);
		} catch (ParseException e) {
		} //Parsers
		
		this.endDate = date;
	}
	public String getTaskComplexity() {
		return taskComplexity;
	}
	public void setTaskComplexity(String taskComplexity) {
		this.taskComplexity = taskComplexity;
	}
}

package com.ltimindtree.poc.entity;

import java.util.Map;

import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "projectParameter")
public class ProjectParameter {
	
	private static final long serialVersionUID = 1L;

	@DynamoDBHashKey()
	private String projectId;
	
	@DynamoDBAttribute
	private String paramName;
	
	@DynamoDBAttribute
	private String maxRange;
	
	@DynamoDBAttribute
	private Map<String,String> rangetext;
	
	@DynamoDBAttribute
	private String weightage;
	
	@DynamoDBAttribute
	private String updatedAt;
	
	@DynamoDBAttribute
	private String createdAt;
	
	@DynamoDBAttribute
	private boolean isDeleted;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(String maxRange) {
		this.maxRange = maxRange;
	}

	public Map<String, String> getRangetext() {
		return rangetext;
	}

	public void setRangetext(Map<String, String> rangetext) {
		this.rangetext = rangetext;
	}

	public String getWeightage() {
		return weightage;
	}

	public void setWeightage(String weightage) {
		this.weightage = weightage;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	
	
}
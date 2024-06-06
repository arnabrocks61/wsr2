package com.ltimindtree.poc.entity;

import java.util.Map;

import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "wsr_g_sample")
public class ProjectParameter {

	@DynamoDBHashKey()
	private long id;
	
	private String paramName;
	
	private long maxRange;
	
	private Map<String,String> rangetext;
	
	private long weightage;
	
	private String updatedAt;
	
	private String createdAt;
	
	private String isDeleted;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public long getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(long maxRange) {
		this.maxRange = maxRange;
	}

	public Map<String, String> getRangetext() {
		return rangetext;
	}

	public void setRangetext(Map<String, String> rangetext) {
		this.rangetext = rangetext;
	}

	public long getWeightage() {
		return weightage;
	}

	public void setWeightage(long weightage) {
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

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
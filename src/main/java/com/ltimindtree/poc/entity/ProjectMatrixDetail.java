package com.ltimindtree.poc.entity;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName = "projectMatrix")
public class ProjectMatrixDetail {

	private static final long serialVersionUID = 1L;
	
	@DynamoDBHashKey()
	private String projectId;
	
	@DynamoDBAttribute
	private String projectName;
	
	@DynamoDBAttribute
	private String engineeringManagerName;
	
	@DynamoDBAttribute
	private String weekOfAssessment;
	
	@DynamoDBAttribute
	private ArrayList<String> paramList;
	
	@DynamoDBAttribute
	private String overallScoreCurrent;
	
	@DynamoDBAttribute
	private String overallScorelast;
	
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

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEngagementManagerName() {
		return engineeringManagerName;
	}

	public void setEngagementManagerName(String engineeringManagerName) {
		this.engineeringManagerName = engineeringManagerName;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getWeekOfAssessment() {
		return weekOfAssessment;
	}

	public void setWeekOfAssessment(String weekOfAssessment) {
		this.weekOfAssessment = weekOfAssessment;
	}

	public ArrayList<String> getParamList() {
		return paramList;
	}

	public void setParamList(ArrayList<String> paramList) {
		this.paramList = paramList;
	}

	public String getOverallScoreCurrent() {
		return overallScoreCurrent;
	}

	public void setOverallScoreCurrent(String overallScoreCurrent) {
		this.overallScoreCurrent = overallScoreCurrent;
	}

	public String getOverallScorelast() {
		return overallScorelast;
	}

	public void setOverallScorelast(String overallScorelast) {
		this.overallScorelast = overallScorelast;
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

	

	
	
}
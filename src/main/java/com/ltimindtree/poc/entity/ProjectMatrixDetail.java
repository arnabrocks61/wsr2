package com.ltimindtree.poc.entity;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName = "wsr_g_sample")
public class ProjectMatrixDetail {

	@Id
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@DynamoDBHashKey()
	private String projectId;
	
	private String projectName;
	
	private String engagementManagerName;
	
	private String weekOfAssessment;
	
	private ArrayList<String> paramList;
	
	private String overallScoreCurrent;
	
	private String overallScorelast;
	
	private String updatedAt;
	
	private String createdAt;
	
	private String isDeleted;
	
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
		return engagementManagerName;
	}

	public void setEngagementManagerName(String engagementManagerName) {
		this.engagementManagerName = engagementManagerName;
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

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	
	
}
package com.ltimindtree.poc.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;


@DynamoDBTable(tableName = "projectData")
public class ProjectData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*
	@Id
	@DynamoDBHashKey(attributeName = "project")
	private String pk;

	@DynamoDBRangeKey(attributeName = "project")
	private String sk;
*/
	@DynamoDBHashKey()
	private String projectId;

	@DynamoDBAttribute 
	private String projectName;

	@DynamoDBAttribute 
	private String entityType;

	@DynamoDBAttribute 
	private String du;

	@DynamoDBAttribute 
	private String engineeringManagerName;

	@DynamoDBAttribute 
	private String createdTs;

	@DynamoDBAttribute 
	private String updatedTs;

	@DynamoDBAttribute 
	private boolean isDeleted;

	@DynamoDBAttribute 
	private boolean isSunsetCompleted;

	@DynamoDBAttribute 
	private boolean isProjectEvaluated;
/*
	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getSk() {
		return sk;
	}

	public void setSk(String sk) {
		this.sk = sk;
	}
*/
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

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getDu() {
		return du;
	}

	public void setDu(String du) {
		this.du = du;
	}

	public String getEngineeringManagerName() {
		return engineeringManagerName;
	}

	public void setEngineeringManagerName(String engineeringManagerName) {
		this.engineeringManagerName = engineeringManagerName;
	}

	public String getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(String createdTs) {
		this.createdTs = createdTs;
	}

	public String getUpdatedTs() {
		return updatedTs;
	}

	public void setUpdatedTs(String updatedTs) {
		this.updatedTs = updatedTs;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isSunsetCompleted() {
		return isSunsetCompleted;
	}

	public void setSunsetCompleted(boolean isSunsetCompleted) {
		this.isSunsetCompleted = isSunsetCompleted;
	}

	public boolean isProjectEvaluated() {
		return isProjectEvaluated;
	}

	public void setProjectEvaluated(boolean isProjectEvaluated) {
		this.isProjectEvaluated = isProjectEvaluated;
	}

	
}

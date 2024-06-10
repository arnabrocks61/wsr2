package com.ltimindtree.poc.repository;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.ltimindtree.poc.entity.ProjectParameter;

	@EnableScan
	public interface ProjectParameterRepo extends CrudRepository<ProjectParameter, String> {

}
package com.ltimindtree.poc.repository;


import org.springframework.data.repository.CrudRepository;

import com.ltimindtree.poc.entity.ProjectParameter;

	
	public interface ProjectParameterRepo extends CrudRepository<ProjectParameter, Long> {

}
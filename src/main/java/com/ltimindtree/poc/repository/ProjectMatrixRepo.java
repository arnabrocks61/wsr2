package com.ltimindtree.poc.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.ltimindtree.poc.entity.ProjectMatrixDetail;


@EnableScan
	public interface ProjectMatrixRepo extends CrudRepository<ProjectMatrixDetail, String> {

}

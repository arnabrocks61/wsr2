package com.ltimindtree.poc.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltimindtree.poc.entity.ProjectMatrixDetail;



	public interface ProjectMatrixRepo extends CrudRepository<ProjectMatrixDetail, Long> {

}

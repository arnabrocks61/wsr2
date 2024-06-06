package com.ltimindtree.poc.service;


import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ltimindtree.poc.entity.ProjectData;



@Service
public class ProjectDataService {

	@Autowired
	private com.ltimindtree.poc.repository.ProjectDataRepo ProjectDataRepo;
	
	
	public List<ProjectData> findAll() {
		//return ProjectDataRepo.findByPartitionKeyAndSortKey("project", "project");
		return (List<ProjectData>) ProjectDataRepo.findAll();
	}

	/*
	public ProjectData createProduct(ProjectData projects) {
		return ProjectDataRepo.save(projects);
	}

	public ProjectData updateProduct(ProjectData projects) {
		Optional<ProjectData> optionalProduct = ProjectDataRepo.findById(projects.getId());

		if (optionalProduct.isPresent()) {
			ProjectData updateProd = optionalProduct.get();
			updateProd.setProjectName(projects.getProjectName());
			updateProd.setProjectId(projects.getProjectId());

			ProjectDataRepo.save(updateProd);

			return updateProd;
		}

		throw new RuntimeException("Product Not available " + projects.getId());

	}
	
	public List<ProjectData> updateBulkProduct(List<ProjectData> projectlist) 
	{
		List<ProjectData> newlist = null;
		for (ProjectData projects : projectlist) {
			
		
		Optional<ProjectData> optionalProduct = ProjectDataRepo.findById(projects.getId());

		if (optionalProduct.isPresent()) {
			ProjectData updateProd = optionalProduct.get();
			updateProd.setProjectName(projects.getProjectName());
			updateProd.setProjectId(projects.getProjectId());
			updateProd.setEngagementManagerName(projects.getEngagementManagerName());
			updateProd.setCreatedAt(projects.getCreatedAt());
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			Date date = new Date();  
			updateProd.setUpdatedAt(formatter.format(date));
			
			updateProd.setIsDeleted(projects.getIsDeleted());

			ProjectDataRepo.save(updateProd);
			newlist.add(updateProd);
			
		}
		}
		return newlist;
		

	}
	
	


	public ProjectData findProductById(long id) {
		Optional<ProjectData> optionalProduct = ProjectDataRepo.findById(id);

		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		}

		throw new RuntimeException("Product Not available " + id);
	}
	
	public void deleteById(long id) {
		Optional<ProjectData> optionalProduct = ProjectDataRepo.findById(id);

		if (optionalProduct.isPresent()) {
			ProjectDataRepo.deleteById(id);
			return;
		}
		
		throw new RuntimeException("Product Not available " + id);
	}
*/
}

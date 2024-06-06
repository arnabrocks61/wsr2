package com.ltimindtree.poc.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.poc.entity.ProjectParameter;

@Service
public class ParameterService {

	@Autowired
	private com.ltimindtree.poc.repository.ProjectParameterRepo ProjectParameterRepo;
/*
	public ProjectParameter createProduct(ProjectParameter projects) {
		return ProjectParameterRepo.save(projects);
	}

	public ProjectParameter updateProduct(ProjectParameter projects) {
		Optional<ProjectParameter> optionalProduct = ProjectParameterRepo.findById(projects.getId());

		if (optionalProduct.isPresent()) {
			ProjectParameter updateProd = optionalProduct.get();
			updateProd.setParamName(projects.getParamName());

			ProjectParameterRepo.save(updateProd);

			return updateProd;
		}

		throw new RuntimeException("Product Not available " + projects.getId());

	}
	
	public List<ProjectParameter> updateBulkProduct(List<ProjectParameter> projectlist) 
	{
		List<ProjectParameter> newlist = null;
		for (ProjectParameter projects : projectlist) {
			
		
		Optional<ProjectParameter> optionalProduct = ProjectParameterRepo.findById(projects.getId());

		if (optionalProduct.isPresent()) {
			ProjectParameter updateProd = optionalProduct.get();
			
			updateProd.setId(projects.getId());
			updateProd.setCreatedAt(projects.getCreatedAt());
			updateProd.setIsDeleted(projects.getIsDeleted());
			updateProd.setRangetext(projects.getRangetext());
			updateProd.setParamName(projects.getParamName());
			updateProd.setWeightage(projects.getWeightage());
			updateProd.setMaxRange(projects.getMaxRange());
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			Date date = new Date();  
			updateProd.setUpdatedAt(formatter.format(date));
			
			

			ProjectParameterRepo.save(updateProd);
			newlist.add(updateProd);
			
		}
		}
		return newlist;
		

	}
	
	public List<ProjectParameter> findAll() {
		return ProjectParameterRepo.findAll();
	}



	public ProjectParameter findProductById(long id) {
		Optional<ProjectParameter> optionalProduct = ProjectParameterRepo.findById(id);

		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		}

		throw new RuntimeException("Product Not available " + id);
	}
	
	public void deleteById(long id) {
		Optional<ProjectParameter> optionalProduct = ProjectParameterRepo.findById(id);

		if (optionalProduct.isPresent()) {
			ProjectParameterRepo.deleteById(id);
			return;
		}
		
		throw new RuntimeException("Product Not available " + id);
	}
*/
}

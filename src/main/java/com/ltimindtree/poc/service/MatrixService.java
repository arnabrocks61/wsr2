package com.ltimindtree.poc.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.poc.entity.ProjectMatrixDetail;
import com.ltimindtree.poc.entity.ProjectParameter;
import com.ltimindtree.poc.repository.ProjectParameterRepo;

@Service
public class MatrixService {


	@Autowired
	private com.ltimindtree.poc.repository.ProjectMatrixRepo ProjectMatrixRepo;
/*
	public ProjectMatrixDetail createProduct(ProjectMatrixDetail projects) {
		return ProjectMatrixRepo.save(projects);
	}

	
	public List<ProjectMatrixDetail> updateBulkProduct(List<ProjectMatrixDetail> projectlist) 
	{
		List<ProjectMatrixDetail> newlist = null;
		for (ProjectMatrixDetail projects : projectlist) {
			
		
		Optional<ProjectMatrixDetail> optionalProduct = ProjectMatrixRepo.findById(projects.getId());

		if (optionalProduct.isPresent()) {
			ProjectMatrixDetail updateProd = optionalProduct.get();
			
			updateProd.setId(projects.getId());
			updateProd.setProjectName(projects.getProjectName());
			updateProd.setProjectId(projects.getProjectId());
			updateProd.setEngagementManagerName(projects.getEngagementManagerName());
			updateProd.setCreatedAt(projects.getCreatedAt());
			updateProd.setIsDeleted(projects.getIsDeleted());
			updateProd.setOverallScoreCurrent(projects.getOverallScoreCurrent());
			updateProd.setOverallScorelast(projects.getOverallScorelast());
			updateProd.setWeekOfAssessment(projects.getWeekOfAssessment());
			updateProd.setParamList(projects.getParamList());
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			Date date = new Date();  
			updateProd.setUpdatedAt(formatter.format(date));
			
			

			ProjectMatrixRepo.save(updateProd);
			newlist.add(updateProd);
			
		}
		}
		return newlist;
		

	}
	
	public List<ProjectMatrixDetail> findAll() {
		return ProjectMatrixRepo.findAll();
	}



	public ProjectMatrixDetail findProductById(long id) {
		Optional<ProjectMatrixDetail> optionalProduct = ProjectMatrixRepo.findById(id);

		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		}

		throw new RuntimeException("Product Not available " + id);
	}
	
	public void deleteById(long id) {
		Optional<ProjectMatrixDetail> optionalProduct = ProjectMatrixRepo.findById(id);

		if (optionalProduct.isPresent()) {
			ProjectMatrixRepo.deleteById(id);
			return;
		}
		
		throw new RuntimeException("Product Not available " + id);
	}
*/
}

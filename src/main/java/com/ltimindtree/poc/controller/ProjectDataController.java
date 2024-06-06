package com.ltimindtree.poc.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.google.gson.Gson;
import com.ltimindtree.poc.entity.ProjectData;
import com.ltimindtree.poc.repository.ProjectDataRepo;
import com.ltimindtree.poc.service.ProjectDataService;



@RestController
@RequestMapping("/api/projectdata")
public class ProjectDataController {
	
	private DynamoDBMapper dynamoDBMapper;

    @Autowired
    private AmazonDynamoDB amazonDynamoDB;

    @Autowired
    private ProjectDataRepo projDataRepo;
    
	@Autowired
	private ProjectDataService projectService;
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		

		
		 Iterable<ProjectData> pdreturn = projDataRepo.findAll();
		 for (ProjectData pd : pdreturn) {
	            System.out.println("List object: " + new Gson().toJson(pd));
	        }
		//List<ProjectData> prods = projectService.findAll();

		
		return ResponseEntity.ok().body(pdreturn);
	}

	@PostMapping()
	public ResponseEntity<Iterable<ProjectData>> createProduct(@RequestBody ProjectData projects) {
		projDataRepo.save(projects);
		return ResponseEntity.ok().body(projDataRepo.findAll());
	}
	
	@PutMapping()
	public ResponseEntity<Iterable<ProjectData>> updateProduct(@RequestBody List<ProjectData> projectlist) {
		projDataRepo.saveAll(projectlist);
		return ResponseEntity.ok().body(projDataRepo.findAll());
	}
	
	@DeleteMapping()
	public HttpStatus deleteProduct(@PathVariable String projectId) {
		projDataRepo.deleteById(projectId);
		
		return HttpStatus.OK;
	}

}

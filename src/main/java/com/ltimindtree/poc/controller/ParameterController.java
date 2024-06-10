package com.ltimindtree.poc.controller;

import java.util.List;

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

import com.google.gson.Gson;
import com.ltimindtree.poc.entity.ProjectData;
import com.ltimindtree.poc.entity.ProjectParameter;
import com.ltimindtree.poc.repository.ProjectParameterRepo;
import com.ltimindtree.poc.service.ParameterService;
import com.ltimindtree.poc.service.ProjectDataService;

	@RestController
	@RequestMapping("/api/parameter")
	public class ParameterController {
		
		@Autowired
		private ProjectParameterRepo parameterRepo;
		
		@GetMapping
		public ResponseEntity<?> findAll() {
			

			
			 Iterable<ProjectParameter> pdreturn = parameterRepo.findAll();
			 for (ProjectParameter pd : pdreturn) {
		            System.out.println("List object: " + new Gson().toJson(pd));
		        }
			//List<ProjectData> prods = projectService.findAll();

			
			return ResponseEntity.ok().body(pdreturn);
		}

		@PostMapping()
		public ResponseEntity<Iterable<ProjectParameter>> createProduct(@RequestBody ProjectParameter projects) {
			parameterRepo.save(projects);
			return ResponseEntity.ok().body(parameterRepo.findAll());
		}
		
		@PutMapping()
		public ResponseEntity<Iterable<ProjectParameter>> updateProduct(@RequestBody List<ProjectParameter> projectlist) {
			parameterRepo.saveAll(projectlist);
			return ResponseEntity.ok().body(parameterRepo.findAll());
		}
		
		@DeleteMapping()
		public HttpStatus deleteProduct(@PathVariable String projectId) {
			parameterRepo.deleteById(projectId);
			
			return HttpStatus.OK;
		}
	}

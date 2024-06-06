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

import com.ltimindtree.poc.entity.ProjectData;
import com.ltimindtree.poc.entity.ProjectParameter;
import com.ltimindtree.poc.service.ParameterService;
import com.ltimindtree.poc.service.ProjectDataService;

	@RestController
	@RequestMapping("/api/parameter")
	public class ParameterController {
		/*
		@Autowired
		private ParameterService parameterService;
		
		@GetMapping
		public ResponseEntity<?> findAll() {
			
			List<ProjectParameter> prods = parameterService.findAll();

			
			return ResponseEntity.ok().body(prods);
		}

		@PostMapping()
		public ResponseEntity<ProjectParameter> createProduct(@RequestBody ProjectParameter projects) {
			return ResponseEntity.ok().body(parameterService.createProduct(projects));
		}
		
		@PutMapping()
		public ResponseEntity<List<ProjectParameter>> updateProduct(@RequestBody List<ProjectParameter> projectlist) {
			return ResponseEntity.ok().body(parameterService.updateBulkProduct(projectlist));
		}
		
		@DeleteMapping()
		public HttpStatus deleteProduct(@PathVariable long id) {
			parameterService.deleteById(id);
			
			return HttpStatus.OK;
		}
*/
	}

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
import com.ltimindtree.poc.entity.ProjectMatrixDetail;
import com.ltimindtree.poc.repository.ProjectMatrixRepo;
import com.ltimindtree.poc.service.MatrixService;

@RestController
@RequestMapping("/api/projectmatrix")
public class MatrixController {


	
		
		@Autowired
		private ProjectMatrixRepo matrixRepo;
		
		@GetMapping
		public ResponseEntity<?> findAll() {
			

			
			 Iterable<ProjectMatrixDetail> pdreturn = matrixRepo.findAll();
			 for (ProjectMatrixDetail pd : pdreturn) {
		            System.out.println("List object: " + new Gson().toJson(pd));
		        }
			//List<ProjectData> prods = projectService.findAll();

			
			return ResponseEntity.ok().body(pdreturn);
		}

		@PostMapping()
		public ResponseEntity<Iterable<ProjectMatrixDetail>> createProduct(@RequestBody ProjectMatrixDetail projects) {
			matrixRepo.save(projects);
			return ResponseEntity.ok().body(matrixRepo.findAll());
		}
		
		@PutMapping()
		public ResponseEntity<Iterable<ProjectMatrixDetail>> updateProduct(@RequestBody List<ProjectMatrixDetail> projectlist) {
			matrixRepo.saveAll(projectlist);
			return ResponseEntity.ok().body(matrixRepo.findAll());
		}
		
		@DeleteMapping()
		public HttpStatus deleteProduct(@PathVariable String projectId) {
			matrixRepo.deleteById(null);
			
			return HttpStatus.OK;
		}

	}

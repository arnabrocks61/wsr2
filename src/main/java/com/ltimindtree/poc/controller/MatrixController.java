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

import com.ltimindtree.poc.entity.ProjectMatrixDetail;
import com.ltimindtree.poc.service.MatrixService;

@RestController
@RequestMapping("/api/projectmatrix")
public class MatrixController {


	/*
		
		@Autowired
		private MatrixService matrixService;
		
		@GetMapping
		public ResponseEntity<?> findAll() {
			
			List<ProjectMatrixDetail> prods = matrixService.findAll();

			
			return ResponseEntity.ok().body(prods);
		}

		@PostMapping()
		public ResponseEntity<ProjectMatrixDetail> createProduct(@RequestBody ProjectMatrixDetail projects) {
			return ResponseEntity.ok().body(matrixService.createProduct(projects));
		}
		
		@PutMapping()
		public ResponseEntity<List<ProjectMatrixDetail>> updateProduct(@RequestBody List<ProjectMatrixDetail> projectlist) {
			return ResponseEntity.ok().body(matrixService.updateBulkProduct(projectlist));
		}
		
		@DeleteMapping()
		public HttpStatus deleteProduct(@PathVariable long id) {
			matrixService.deleteById(id);
			
			return HttpStatus.OK;
		}
*/
	}

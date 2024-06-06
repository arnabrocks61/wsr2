package com.ltimindtree.poc.repository;


import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDB;
import com.ltimindtree.poc.entity.ProjectData;


@EnableScan
public interface ProjectDataRepo  extends CrudRepository<ProjectData, String> {

//	@Query("select p from Products p where p.description like '%test%'")
//	List<Products> findAllProductWithDescription();
//	
//	@Query(nativeQuery = true, value = "select * from Products p where p.description like '%test%'")
//	List<Products> findAllProductWithDescriptionWithNativeQuery();
//	
//	@Query("select p from Products p where p.description IN (:descrption)")
//	List<Products> findAllProductWithDescriptionWithParam(@Param("descrption") List<String> descrption);
//	
//	@Query("select count(1) from Products p GROUP BY p.description")
//	List<String> findAllProductById();
//	
//	@Query("select p from Products p order by p.name desc")
//	List<Products> findAllProductWithOrder();
//	
//	@Query("select o from Order o JOIN o.product")
//	List<Order> findOrder();
	
	//List<ProjectData> findByPartitionKeyAndSortKey(String pk, String sk);
	//List<ProjectData> finadAll();
}
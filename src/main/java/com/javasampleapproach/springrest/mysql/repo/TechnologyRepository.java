package com.javasampleapproach.springrest.mysql.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.javasampleapproach.springrest.mysql.model.Technology;

public interface TechnologyRepository extends CrudRepository<Technology, Long> {

	/* List<Technology> findByName(String name); */

	/*
	 * @Transactional
	 * 
	 * @Query(value="select t.id from Technology t where t.technology_name like ?1"
	 * ,nativeQuery=true) boolean ifNameExists(String name);
	 */

	

}

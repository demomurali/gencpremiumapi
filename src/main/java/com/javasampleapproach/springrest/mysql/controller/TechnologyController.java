package com.javasampleapproach.springrest.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.Customer;
import com.javasampleapproach.springrest.mysql.model.Technology;
import com.javasampleapproach.springrest.mysql.repo.TechnologyRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TechnologyController {

	@Autowired
	TechnologyRepository technologyRepository;

	@GetMapping("/getTechnology")
	public List<Technology> getAllTechnology() {
		//System.out.println("Get all Customers...");

		List<Technology> technologies = new ArrayList<>();
		technologyRepository.findAll().forEach(technologies::add);

		return technologies;
	}

	@GetMapping("/getTechnology/{id}")
	public Optional<Technology> searchResults(@PathVariable("id") long id) {

		Optional<Technology> technology = technologyRepository.findById(id);
		return technology;

	}

	/*
	 * @GetMapping("/getTechnologyByName/{name}") public List<Technology>
	 * searchSkills(@PathVariable("name") String name) { List<Technology>
	 * technologies=new ArrayList<>(); if(technologyRepository.ifNameExists(name))
	 * technologies=technologyRepository.findByName(name); else
	 * technologies=(List<Technology>) technologyRepository.findAll();
	 * if(name==null) { technologies=(List<Technology>)
	 * technologyRepository.findAll(); } return technologies; }
	 */
}
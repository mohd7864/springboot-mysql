package com.springboot.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mysql.entity.Person;
import com.springboot.mysql.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonRepository repository;
	
	@PostMapping("/create")
	public Person create(@RequestBody Person person) {
		return repository.save(person);
	}
	
	@GetMapping("/getPersons")
	public List<Person> getPersons(){
		return repository.findAll();
	}
}

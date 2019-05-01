package controller;

import java.util.ArrayList;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService ps;

	@RequestMapping("/all")
	public ArrayList<Person> getAll() {
		System.out.println("mon deuxième  commit test git sur ma branche1_test ");
		System.out.println("mon deuxième  commit test git sur ma branche1_test +affichage sumpplémentaire ")
		return ps.getAll();
	}

	@RequestMapping("{id}")
	public Person getPerson(@PathVariable("id") String id) {
		return ps.getPerson(id);
	}
}


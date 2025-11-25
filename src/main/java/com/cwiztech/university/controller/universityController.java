package com.cwiztech.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cwiztech.university.repository.universityRepository;
import com.cwiztech.university.model.University;

@RestController
@CrossOrigin
@RequestMapping("/university")
public class universityController {

	@Autowired
	private universityRepository universityrepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<University> get() {

		List<University> universities = universityrepository.findAll();

		return universities;
	}
}

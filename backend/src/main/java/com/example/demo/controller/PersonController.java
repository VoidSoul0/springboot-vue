package com.example.demo.controller;

import com.example.demo.dao.PersonDao;
import com.example.demo.entoty.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Resource
	private PersonDao personDao;

	@GetMapping("listAll")
	public List<Person> listAll(){
		return personDao.selectAll();
	}
}

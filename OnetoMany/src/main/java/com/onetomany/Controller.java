package com.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/books")
public class Controller {
	
	@Autowired
	BookService s;
	
	@PostMapping(path="/setAll")
	public String setAll(@RequestBody Book b) {
		return s.setAll(b);
	}@GetMapping(path="/get/{id}")
	public Book getById(@PathVariable int id) {
		return s.getById(id);
	}

}

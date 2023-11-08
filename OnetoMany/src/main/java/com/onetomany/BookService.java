package com.onetomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookDao bd;

	public String setAll(Book b) {	
		return bd.setAll(b);
	}

	public Book getById(int id) {
		return bd.getById(id);
	}
	
	

}

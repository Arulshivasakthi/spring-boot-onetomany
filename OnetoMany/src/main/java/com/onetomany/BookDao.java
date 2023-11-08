package com.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

	@Autowired
	BookRepository br;
	
	
	public String setAll(Book b) {
		br.save(b);
		return "saved";
	}
	public Book getById(int id) {
		return br.findById(id).orElse(null);
	}

}

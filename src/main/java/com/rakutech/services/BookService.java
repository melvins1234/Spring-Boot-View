package com.rakutech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakutech.entities.User;
import com.rakutech.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<User> list() {
        return bookRepository.findAll();
    }

}

package com.rakutech.rakutech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakutech.rakutech.entities.User;
import com.rakutech.rakutech.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> list() {
        return userRepository.findAll();
    }
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User get(long id) {
		return userRepository.findById(id).get();
	}
	
	public void delete(long id) {
		userRepository.deleteById(id);
	}
	
	public User getByEmail(String email) {
		return userRepository.findByEmailAddress(email);
	}

}

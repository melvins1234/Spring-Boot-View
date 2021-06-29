package com.rakutech.rakutech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.rakutech.rakutech.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}

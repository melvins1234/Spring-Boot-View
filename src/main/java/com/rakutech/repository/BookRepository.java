package com.rakutech.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.rakutech.entities.User;

@Repository
public interface BookRepository extends JpaRepositoryImplementation<User, Long> {

}

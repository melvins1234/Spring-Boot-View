package com.rakutech.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.rakutech.entities.Book;

@Repository
public interface BookRepository extends JpaRepositoryImplementation<Book, Long> {

}

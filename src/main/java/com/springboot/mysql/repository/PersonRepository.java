package com.springboot.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mysql.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {

}

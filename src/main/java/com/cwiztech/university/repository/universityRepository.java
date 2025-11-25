package com.cwiztech.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cwiztech.university.model.University;

public interface universityRepository extends JpaRepository<University, Long> {

}

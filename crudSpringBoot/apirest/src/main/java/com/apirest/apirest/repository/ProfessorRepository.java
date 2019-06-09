package com.apirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.apirest.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, String>{

}

package com.apirest.apirest.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.apirest.models.Aluno;
import com.apirest.apirest.models.Professor;
import com.apirest.apirest.repository.AlunoRepository;
import com.apirest.apirest.repository.ProfessorRepository;

@RestController
@RequestMapping("/professor")
public class ProfessorResource {
	
	@Autowired
	private ProfessorRepository pr;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Professor> listaProfessores() {
		Iterable<Professor> listaProfessores = pr.findAll();
		return listaProfessores;
	}
	
	@PostMapping()
	public Professor cadastraProfessor(@RequestBody @Valid Professor professor) {
		return pr.save(professor);
	}
	
	@PutMapping()
	public Professor editaProfessor(@RequestBody @Valid Professor professor) {
		return pr.save(professor);
	}
	@DeleteMapping()
	public Professor deletaProfessor(@RequestBody Professor professor) {
		pr.delete(professor);
		return professor;
	}

}

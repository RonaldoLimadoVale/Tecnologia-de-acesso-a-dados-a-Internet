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
import com.apirest.apirest.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository ar;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Aluno> listaAlunos() {
		Iterable<Aluno> listaAlunos = ar.findAll();
		return listaAlunos;
	}
	
	@PostMapping()
	public Aluno cadastraAluno(@RequestBody @Valid Aluno aluno) {
		return ar.save(aluno);
	}
	
	@PutMapping()
	public Aluno editaAluno(@RequestBody @Valid Aluno aluno) {
		return ar.save(aluno);
	}
	@DeleteMapping()
	public Aluno deletaAluno(@RequestBody Aluno aluno) {
		ar.delete(aluno);
		return aluno;
	}
	
}





















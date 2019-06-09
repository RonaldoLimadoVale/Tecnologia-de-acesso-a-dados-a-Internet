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


import com.apirest.apirest.models.Disciplina;
import com.apirest.apirest.repository.DisciplinaRepository;


@RestController
@RequestMapping("/disciplina")
public class DisciplinaResource {
	
	@Autowired
	private DisciplinaRepository dr;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Disciplina> listaDisciplinas() {
		Iterable<Disciplina> listaDisciplinas = dr.findAll();
		return listaDisciplinas;
	}
	
	@PostMapping()
	public Disciplina cadastraDisciplina(@RequestBody @Valid Disciplina disciplina) {
		return dr.save(disciplina);
	}
	
	@PutMapping()
	public Disciplina editaAluno(@RequestBody @Valid Disciplina disciplina) {
		return dr.save(disciplina);
	}
	@DeleteMapping()
	public Disciplina deletaAluno(@RequestBody Disciplina disciplina) {
		dr.delete(disciplina);
		return disciplina;
	}

}

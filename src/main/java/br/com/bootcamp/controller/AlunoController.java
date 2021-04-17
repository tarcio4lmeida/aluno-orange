package br.com.bootcamp.controller;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bootcamp.controller.form.AlunoForm;
import br.com.bootcamp.dto.AlunoDTO;
import br.com.bootcamp.dto.DetalheAlunoDTO;
import br.com.bootcamp.modelo.Aluno;
import br.com.bootcamp.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;
	
	@PostMapping
	@Transactional
	public ResponseEntity<AlunoDTO> cadastrar(@RequestBody @Valid AlunoForm form) {
		Aluno aluno = new Aluno(form);
		alunoRepository.save(aluno);
		return ResponseEntity.ok(new AlunoDTO(aluno));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DetalheAlunoDTO> detalhar(@PathVariable("id") Long id) {
		Optional<Aluno> optAluno = alunoRepository.findById(id);
		if(optAluno.isPresent()) {
			return ResponseEntity.ok(new DetalheAlunoDTO(optAluno.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
}

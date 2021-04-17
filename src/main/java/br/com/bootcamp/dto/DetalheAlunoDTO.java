package br.com.bootcamp.dto;

import br.com.bootcamp.modelo.Aluno;

public class DetalheAlunoDTO {
	private String nome;
	private String email;
	
	public DetalheAlunoDTO() {
	}

	public DetalheAlunoDTO (Aluno aluno) {
		this.nome = aluno.getNome();
		this.email = aluno.getEmail();
	}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	
}

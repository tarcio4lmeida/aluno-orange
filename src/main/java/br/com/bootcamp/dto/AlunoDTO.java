package br.com.bootcamp.dto;

import br.com.bootcamp.modelo.Aluno;

public class AlunoDTO {
	
	private String nome;
	private String email;
	private Integer idade;
	
	
	public AlunoDTO (Aluno aluno) {
		this.nome = aluno.getNome();
		this.email = aluno.getEmail();
		this.idade = aluno.getIdade();
		
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}

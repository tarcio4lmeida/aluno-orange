package br.com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bootcamp.modelo.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}

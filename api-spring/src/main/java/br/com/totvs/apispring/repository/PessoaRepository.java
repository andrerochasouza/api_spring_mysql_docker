package br.com.totvs.apispring.repository;

import br.com.totvs.apispring.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

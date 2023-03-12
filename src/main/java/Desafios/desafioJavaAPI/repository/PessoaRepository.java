package Desafios.desafioJavaAPI.repository;

import Desafios.desafioJavaAPI.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

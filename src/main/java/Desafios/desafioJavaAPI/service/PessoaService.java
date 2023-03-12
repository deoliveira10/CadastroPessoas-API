package Desafios.desafioJavaAPI.service;

import Desafios.desafioJavaAPI.model.Pessoa;
import Desafios.desafioJavaAPI.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa criar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }


    public List<Pessoa> listaPessoa() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> consultarUmaPessoaporID(Long id) {
        return pessoaRepository.findById(id);
    }

    public void removerPorId(Long id){
        pessoaRepository.deleteById(id);
    }
}

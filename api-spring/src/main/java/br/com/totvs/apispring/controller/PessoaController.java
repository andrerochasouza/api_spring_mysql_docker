package br.com.totvs.apispring.controller;

import br.com.totvs.apispring.dao.PessoaDAO;
import br.com.totvs.apispring.dto.PessoaDTO;
import br.com.totvs.apispring.model.Pessoa;
import br.com.totvs.apispring.repository.PessoaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping("/")
    public List<PessoaDTO> findAll() {
        return  pessoaRepository.findAll()
                .stream()
                .map(PessoaDTO::converterToPessoaDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PessoaDTO findById(@PathVariable("id") Long id) {
        Pessoa pessoa = pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        return PessoaDTO.converterToPessoaDTO(pessoa);
    }

    @PostMapping("/")
    public void saveOnePerson(@RequestBody PessoaDAO pessoaDAO) {
        pessoaRepository.save(pessoaDAO.converterToPessoa(pessoaDAO));
    }

    @PutMapping("/{id}")
    public PessoaDTO updateOnePerson(@PathVariable("id") Long id, @RequestBody PessoaDAO pessoaDAO) {
        Pessoa pessoa = pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        pessoa.setNome(pessoaDAO.getNome());
        pessoa.setSobrenome(pessoaDAO.getSobrenome());
        pessoaRepository.save(pessoa);
        return PessoaDTO.converterToPessoaDTO(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deleteOnePerson(@PathVariable("id") Long id) {
        Pessoa pessoa = pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        pessoaRepository.delete(pessoa);
    }
}

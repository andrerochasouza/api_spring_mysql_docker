package br.com.totvs.apispring.dto;

import br.com.totvs.apispring.model.Pessoa;

import javax.persistence.Column;

public class PessoaDTO {

    private Long cd_pessoa;
    private String nome;
    private String sobrenome;

    public static PessoaDTO converterToPessoaDTO(Pessoa pessoa) {
        PessoaDTO dto = new PessoaDTO();
        dto.setCd_pessoa(pessoa.getCd_pessoa());
        dto.setNome(pessoa.getNome());
        dto.setSobrenome(pessoa.getSobrenome());
        return dto;
    }

    public Long getCd_pessoa() {
        return cd_pessoa;
    }

    public void setCd_pessoa(Long cd_pessoa) {
        this.cd_pessoa = cd_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
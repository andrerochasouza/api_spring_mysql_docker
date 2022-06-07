package br.com.totvs.apispring.dao;

import br.com.totvs.apispring.model.Pessoa;

public class PessoaDAO {

    private String nome;
    private String sobrenome;

    public static Pessoa converterToPessoa(PessoaDAO pessoaDAO){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaDAO.getNome());
        pessoa.setSobrenome(pessoaDAO.getSobrenome());
        return pessoa;
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

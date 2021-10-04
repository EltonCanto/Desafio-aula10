package br.com.tech4me.primeirorest.view.model;

import java.util.List;

import br.com.tech4me.primeirorest.compartilhado.Animais;

public class PessoaModeloResponseDetalhes {
    private String id;
    private String nome;
    private String sobrenome;
    private List<Animais> animais;
    
    public List<Animais> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animais> animais) {
        this.animais = animais;
    }

    //#region Get / Set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

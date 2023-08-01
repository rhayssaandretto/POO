package atividade_classe;

import java.util.Date;

//Crie uma classe Java (versão 17) Pessoa com os atributos Nome, Data de Nascimento e Idade.
//Crie no mínimo três Construtores e métodos (getters e setters).
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private int idade;

    //construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    //construtor
    public Pessoa(String nome, String dataNascimento, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }


    //set -> alterar
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setDataNascimento (String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }


    //get
    public String getNome (){
        return nome;
    }

    public String getDataNascimento (){
        return dataNascimento;
    }

    public int getIdade (){
        return idade;
    }
}

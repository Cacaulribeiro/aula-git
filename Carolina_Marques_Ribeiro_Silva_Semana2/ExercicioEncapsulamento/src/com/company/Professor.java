package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Professor {
    //Atributos
    private  String nome;
    private  String curso;
    private  String cpf;
    private  float salario;
    List <Aluno>  listaAlunos= new ArrayList<Aluno>();

    //Construtor


    public Professor(String nome, String curso, String cpf) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
        this.salario = salario;
        this.listaAlunos = listaAlunos;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

//  public void setSalario(float salario) {
//        this.salario = salario;
//    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    //Métodos
    public void lerInfoprof(){
        System.out.println("Nome e curso do professor:"+
                           "\nNome:  "+this.nome+
                           "\nCurso: "+this.curso);
    }

    public float salarioProf(int horasAulasDadas){
               this.salario= horasAulasDadas * 29;

        return this.salario;

    }

    public void numAlunos(){
        System.out.println("O numero de alunos é "+ this.listaAlunos.size());
    }
}

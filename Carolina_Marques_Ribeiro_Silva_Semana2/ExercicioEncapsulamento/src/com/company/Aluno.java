package com.company;

public class Aluno {
    String nome;
    float nota1;
    float nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    //metodo
    public void mediaFinal(){
        float mediaFinal=(this.nota1+this.nota2)/2;
        if(mediaFinal>=7){
            System.out.println("Parabéns a aluna "+this.nome+" foi aprovada!!");

        }else{
            System.out.println("Infelizmente a aluna não foi aprovada");
        }

    }
}

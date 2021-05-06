package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner entrada=new Scanner(System.in);
        int numAulas;

        //criando os professores
        Professor professor1=new Professor("Taina","Java","123");
        Professor professor2=new Professor("Luciana","Vegetações brasileiras","456");

        //criando alunas
        Aluno aluna1=new Aluno();
        Aluno aluna2= new Aluno();
        Aluno aluna3= new Aluno();
        Aluno aluna4= new Aluno();

        //add aluno na lista do professor
        professor1.listaAlunos.add(aluna1);
        professor1.listaAlunos.add(aluna2);
        professor1.listaAlunos.add(aluna3);
        professor1.listaAlunos.add(aluna4);

        System.out.println("O numero de alunos do professor é "+professor1.listaAlunos.size());
        //professor1.numAlunos();

        //lendo informações do professor
        professor1.lerInfoprof();
        System.out.println("\n");

        //pedindo para o usuario inserir o numero de aulas dadas
        System.out.print("Por favor insira o numero de aulas que o professor deu: ");

        numAulas= entrada.nextInt();

        //colando variavel dentro do metodo de salario
        professor1.salarioProf(numAulas);
        System.out.println("O salario d professor é: R$"+professor1.getSalario()+" reais");

        System.out.println("\n");

        //Alimentando os valores da aluna
        System.out.print("Informe o nome da aluna:  ");
        aluna1.nome= entrada.next();
        System.out.print("\nAgora nos informe a nota da prova 1:  ");
        aluna1.nota1= entrada.nextFloat();
        System.out.print("Agora nos informe a nota da prova 2:  ");
        aluna1.nota2= entrada.nextFloat();

        //aplicando o metodo de media final
        aluna1.mediaFinal();






    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean podeSacar;
        //Criando um cliente
        Pessoa cliente1=new Pessoa();
        //Criando uma conta
        Conta contaTai=new Conta(1231,"Tai",200);
        //add os valores do atributos pessoa
        cliente1.setNome("Tai");
        cliente1.setEndereco("Rua pernanbuco");
        cliente1.setCpf("12312312312");
        cliente1.setConta(contaTai);

        //Criando um cliente
        Pessoa cliente2=new Pessoa();
        //Criando uma conta
        Conta contaCliente2=new Conta(2404,"Carol",500);
        //add os valores do atributos pessoa
        cliente2.setNome("Cacau");
        cliente2.setEndereco("Rua Ouro Branco");
        cliente2.setCpf("45645645656");
        cliente2.setConta(contaCliente2);


        //Criando um cliente3
        Pessoa cliente3=new Pessoa();
        //Criando uma conta
        Conta contaCliente3=new Conta(7898,"Neide",350);
        //add os valores do atributos pessoa
        cliente3.setNome("Neide");
        cliente3.setEndereco("Rua São Paulo");
        cliente3.setCpf("96396363");
        cliente3.setConta(contaCliente3);


        //------------Pessoa 1 realizando saque------------------

        podeSacar =cliente1.getConta().sacar(20);

        //imprimir valores
        if (podeSacar==true) {
            System.out.printf("O cliente %s tem cpf %s\n ", cliente1.getNome(), cliente1.getCpf());
            System.out.println("O saldo da conta é: " + cliente1.getConta().getSaldo());
        }else {
            System.out.println("Ihh lascou ! Não foi possível realizar operação");
        }

        //----------Pessoa 2 realiza saque e tranfere Pessoa3 ----------
        //Pessoa2 reaaliza saque
        podeSacar =cliente2.getConta().sacar(40);

        //imprimir valores
        if (podeSacar==true) {
            System.out.printf("O cliente %s tem cpf %s\n ", cliente2.getNome(), cliente2.getCpf());
            System.out.println("O saldo da conta é: " + cliente2.getConta().getSaldo());
        }else {
            System.out.println("Ihh lascou ! Não foi possível realizar operação");
        }
        //Transferindo para Pessoa3
        cliente3.getConta().transferir(40);
        System.out.println("O cliente "+cliente3.getNome()+" recebeu uma transferencia e o saldo da sua conta agora é: "+cliente3.getConta().getSaldo());

        //--------------Pessoa 3 realizando saque-----------
        podeSacar =cliente3.getConta().sacar(15);

        //imprimir valores
        if (podeSacar==true) {
            System.out.printf("O cliente %s tem cpf %s\n ", cliente3.getNome(), cliente3.getCpf());
            System.out.println("O saldo da conta é: " + cliente3.getConta().getSaldo());
        }else {
            System.out.println("Ihh lascou ! Não foi possível realizar operação");
        }







//         contaTai.setDono("Tai");
//         contaTai.setSaldo(50);
//         contaTai.setNumero(123);
//
//        System.out.println(contaTai.sacar(10));
//        System.out.println(contaTai.getSaldo());



    }
}

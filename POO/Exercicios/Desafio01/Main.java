package Desafio01;

public class Main {
    public static void main(String[] args){
        ContaBancaria contaBanco = new ContaBancaria();
        ContaBancaria contaBanco2 = new ContaBancaria();

        contaBanco.abrirConta("cc");
        contaBanco.setDono("Felipe Menezes");
        contaBanco.depositar(100);


        contaBanco2.abrirConta("cp");
        contaBanco2.setDono("Victoria Caminha");
        contaBanco2.sacar(50);

        contaBanco.infomacoes();
        contaBanco2.infomacoes();


    }
}

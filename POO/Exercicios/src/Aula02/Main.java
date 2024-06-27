package Aula02;

public class Main {
    public static void main(String[] args) {
        Garrafa g1 = new Garrafa();

        g1.cor = "Preta";
        g1.tamanho = 500.0f;
        g1.marca = "Weeze";

        g1.fechar();
        g1.encher();
        g1.abrir();
        g1.encher();
        g1.status();
    }
}
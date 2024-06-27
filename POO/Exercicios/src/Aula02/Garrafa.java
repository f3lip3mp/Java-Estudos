package Aula02;

public class Garrafa {
    String cor;
    float tamanho;
    String marca;
    boolean cheia;
    boolean fechada;

    void fechar(){
        this.fechada = true;
    }

    void abrir(){
        this.fechada = false;
    }

    void encher(){
        if (this.fechada){
            System.out.println("Não é possível encher a garrafa pois ela está fechada.");
        }else {
            this.cheia = true;
        }
    }

    void esvaziar() {
        if (this.fechada){
            System.out.println("Não é possível esvaziar a garrafa pois ela está fechada.");
        }else{
            this.cheia = false;
        }
    }

    void status() {
        System.out.println("A garrafa de marca " + this.marca + "- cor " + this.cor +
                "- tamanho " + this.tamanho);
        System.out.println("Está cheia? " + this.cheia);
        System.out.println("Está fechada? " + this.fechada);
    }
}

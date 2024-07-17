package Aula07;

import java.util.Random;

public class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }


    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if(lutador1 == lutador2){
            System.out.println("Não é possível marcar uma luta com os mesmos lutadores.");
        }else if(!lutador1.getCategoria().equals(lutador2.getCategoria())){
            System.out.println("Não é possível marcar uma luta com lutadores de categorias diferentes.");
        }else{
            setAprovada(true);
            setDesafiado(lutador1);
            setDesafiante(lutador2);
            setRounds(getRandomNumber(1,3));
            System.out.println("==== LUTA MARCADA ====");
            System.out.println("Luta de " + getRounds() + " rounds entre " + getDesafiado().getNome() + " e " + getDesafiante().getNome());
            System.out.println("======================");
        }
    }

    public void lutar(){
        if(this.getAprovada()) {
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            int vencedor = this.getRandomNumber(0,3);
            switch (vencedor){
                case 0:
                    System.out.println("EMPATE!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("O VENCEDOR FOI " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("O VENCEDOR FOI " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
        }
        else{
            System.out.println("A luta não pode acontecer pois ela não foi aprovada.");
        }
    }
}


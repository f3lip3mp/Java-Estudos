package Aula06;

public class Main {
    public static void main (String[] args){
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.menosVolume();
        c.menosVolume();
        c.play();
        c.abrirMenu();
    }
}

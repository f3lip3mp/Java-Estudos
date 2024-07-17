package Aula07;

public class Main {
    public static void main(String [] args){
        Lutador lutador1 = new Lutador("Pretty Boy", "França", 31, 68.9, 1.75, 11, 3, 1);
        Lutador lutador2 = new Lutador("Putscript", "Brasil", 29, 58.8, 1.68, 14, 2, 3);
        Lutador lutador3 = new Lutador("Snapshadow", "EUA", 35, 80.9, 1.65, 12, 2, 1);
        Lutador lutador4 = new Lutador("Dead Code", "Austrália", 28, 81.6, 1.93, 13, 0, 2);
        Lutador lutador5 = new Lutador("Ufocobol", "Brasil", 37, 119.3, 1.70, 5, 4, 3);
        Lutador lutador6 = new Lutador("Nerdaard", "EUA", 30, 105.7, 1.81, 12, 2, 4);


        Luta luta01 = new Luta();

        luta01.marcarLuta(lutador1,lutador2);
        luta01.lutar();
    }
}

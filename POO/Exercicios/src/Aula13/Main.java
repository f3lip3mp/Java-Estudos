package Aula13;

public class Main {
    public static void main(String[] args){
        Cachorro c1 = new Cachorro();

        c1.reagir("olá");
        c1.reagir("au au");
        c1.reagir(11,45);
        c1.reagir(21,00);
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2, 12.5f);
        c1.reagir(17, 4.5f);

        Lobo l1 = new Lobo();
        l1.emitirSom();
    }
}

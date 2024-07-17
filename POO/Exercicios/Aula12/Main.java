package Aula12;

public class Main {
    public static void main(String[] args){
        /*
        Mamifero m1 = new Mamifero();

        m1.setMembros(3);
        m1.emitirSom();
        m1.locomover();

        Peixe p1 = new Peixe();

        p1.setCorEscama("Cinza");
        p1.soltarBolha();
        p1.alimentar();

        Ave a1 = new Ave();
        a1.fazerNinho();
        a1.setCorPena("Azul");
        a1.emitirSom();

         */

        Mamifero m2 = new Mamifero();
        Canguru c1 = new Canguru();
        Cachorro k1 = new Cachorro();

        m2.setPeso(34.3f);
        m2.setIdade(8);
        m2.setMembros(4);
        m2.locomover();
        m2.alimentar();
        m2.emitirSom();

        c1.setPeso(55.3f);
        c1.setIdade(3);
        c1.setMembros(4);
        c1.locomover();
        c1.alimentar();
        c1.emitirSom();
        c1.usarBolsa();

        k1.setPeso(22.54f);
        k1.setIdade(5);
        k1.setMembros(4);
        k1.locomover();
        k1.alimentar();
        k1.emitirSom();
        k1.abanarRabo();
    }
}

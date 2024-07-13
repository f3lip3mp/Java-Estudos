package Aula12;

public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("Canguru usou a bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando!");
    }

}

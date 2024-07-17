package Aula12;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Se locomovendo em " + this.membros + " patas.");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando-se...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Fazendo som de mamífero!!!");
    }
}

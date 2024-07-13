package Aula12;

public class Peixe extends Animal{
    public String corEscama;

    public void soltarBolha(){
        System.out.println("Soltando bolha... glub... glub...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Batendo nadadeiras...");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando-se...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub!Glub!");
    }
}

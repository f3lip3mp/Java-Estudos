package Projeto_YouTube;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.isTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        getFilme().setAvaliacao(5);
    }

    public void avaliar(int nota){
        getFilme().setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }else if (porc <= 50){
            tot = 5;
        }else if (porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        getFilme().setAvaliacao(tot);
    }
}

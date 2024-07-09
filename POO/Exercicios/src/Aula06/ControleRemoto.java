package Aula06;

import java.lang.reflect.Method;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return volume;
    }

    private boolean getLigado(){
        return ligado;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(getLigado()) {
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("[]");
            }
        }else{
            System.out.println("A TV está desligada.");
        }

    }

    @Override
    public void fecharMenu() {
        if(getLigado()){
            System.out.println("Fechando Menu.");
        }

    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            setVolume(this.getVolume() + 5);
        }else {
            System.out.println("A TV está desligada.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            setVolume(this.getVolume() - 5);
        }else {
            System.out.println("A TV está desligada.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            setVolume(0);
        }else {
            System.out.println("A TV está desligada.");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            setVolume(50);
        }else {
            System.out.println("A TV está desligada.");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            setTocando(true);
        }else{
            System.out.println("A TV está desligada.");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            setTocando(false);
        }else{
            System.out.println("A TV está desligada.");
        }
    }
}

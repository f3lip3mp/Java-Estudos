package Aula11;

import Aula11.Aluno;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada! Aluno: " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Aluno: " + this.getNome() + " \nMatricula: " + this.getMatr());
    }

    public double getBolsa(){
        return this.bolsa;
    }

    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
}

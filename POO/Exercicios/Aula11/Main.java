package Aula11;

public class Main {
    public static void main(String[] args){
        /*
        Visitante v1 = new Visitante();
        v1.setNome("Felipe");
        v1.setIdade(23);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());

        */
        Aluno a1 = new Aluno();
        a1.setNome("Felipe");
        a1.setIdade(23);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Victória");
        b1.setIdade(26);
        b1.setSexo("Feminino");
        b1.setMatr(334353);
        b1.renovarBolsa();
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setSalario(3000.3f);
        p1.receberAumento(284);
    }
}

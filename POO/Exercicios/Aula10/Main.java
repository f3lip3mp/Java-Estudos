package Aula10;

public class Main {
    public static void main(String [] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Felipe");
        p2.setNome("Marcelo");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("Masculino");
        p2.setSexo("Masculino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminio");

        p2.setCurso("Informática");
        p3.setSalario(250.75f);
        p4.setSetor("Comércio");

        p3.receberAum(520);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}

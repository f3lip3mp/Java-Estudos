package Exercicio01;

public class Main {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro",32, "Masculino");
        p[1] = new Pessoa("Felipe", 23, "Masculino");

        l[0] = new Livro("Aprendendo JAVA", p[0],"Felipe Macedo",222);
        l[1] = new Livro("Aprendendo JAVA Avançado", p[1],"Kity Lion",432);
        l[2] = new Livro("Aprendendo JAVA Básico", p[1],"Felipe Macedo",122);

        l[0].abrir();
        l[0].folhear(222);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}

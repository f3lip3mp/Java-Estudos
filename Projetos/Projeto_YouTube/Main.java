package Projeto_YouTube;

public class Main {
    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Como jogar minecraft");
        v[1] = new Video("Como fazer bolo de fubá");
        v[2] = new Video("Parkou 2024");

        v[1].like();
        //System.out.println(v[0].toString());
        //System.out.println(v[1].toString());
        //System.out.println(v[2].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Felipe", 23, "M", "pipemp");
        g[1] = new Gafanhoto("Victória", 26, "F", "vrcaminha");
        //System.out.println(g[0].toString());
        //System.out.println(g[1].toString());


        Visualizacao vis1 = new Visualizacao(g[0], v[2]);
        vis1.avaliar();
        System.out.println(vis1.toString());
        Visualizacao vis2 = new Visualizacao(g[0], v[1]);
        vis2.avaliar(20f);
        System.out.println(vis2.toString());
    }
}

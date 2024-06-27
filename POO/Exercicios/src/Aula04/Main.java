package Aula04;

public class Main {
    public static void main(String[] args){
        /*
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        c1.status();
        */
        /*
        Caneta c1 = new Caneta("Bic Cristal", "Preta", 0.5f);
        c1.status();

        Caneta c2 = new Caneta("Cely", "Azul", 0.9f);
        c2.status();
         */
        Canal canal1 = new Canal("PipeMP", "www.youtube.com/pipemp", 350);

        //canal1.setNome("PipeMP");
        //canal1.setEndereco("www.youtube.com/channel/pipemp");
        //canal1.setInscritos(346);
        canal1.setVideos("Vídeo 1 - Vídeo 2 - Vídeo 3");
        canal1.acessar();
        canal1.status();
    }
}
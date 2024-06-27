package Aula04;

public class Canal {
    public String nome;
    public String endereco;
    private int inscritos;
    private String videos;
    public boolean acesso;

    public Canal(String n, String e, int i){
        setNome(n);
        setEndereco(e);
        setInscritos(i);
        desconectar();
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        nome = n;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String e){
        endereco = e;
    }
    public int getInscritos(){
        return this.inscritos;
    }
    public void setInscritos(int i){
        inscritos = i;
    }
    public String getVideos(){
        return this.videos;
    }
    public void setVideos(String v){
        videos = v;
    }

    public void acessar(){
        this.acesso = true;
    }

    public void desconectar(){
        this.acesso = false;
    }


    public void status() {
        if (acesso) {
            System.out.println("Bem vindo ao canal " + getNome());
            System.out.println("Link: " + getEndereco());
            System.out.println("Nº de inscritos: " + getInscritos());
            System.out.println("Vídeos: " + getVideos());
        }else{
            System.out.println("Você não acessou o canal");
        }
    }
}

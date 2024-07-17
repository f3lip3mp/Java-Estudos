package Exercicio01;

public class Livro implements Publicacao{
    private String livro;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String livro, Pessoa leitor, String autor, int totPaginas) {
        this.livro = livro;
        this.leitor = leitor;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
    }

    public String detalhes() {
        return "Livro{" +
                "livro='" + livro + '\'' +
                ", autor='" + autor + '\'' +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() +
                '}';
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(!this.isAberto()){
            setAberto(true);
        }else{
            System.out.println("O livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            setAberto(false);
        }else{
            System.out.println("O livro já está fechado!");
        }
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPaginas()){
            System.out.println("Não é possível ir até a página desejada.");
        }else{
            setPagAtual(p);
        }

    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() < getTotPaginas()){
            setPagAtual(this.getPagAtual()+1);
        }else{
            System.out.println("Você chegou ao fim do livro!");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() > 0){
            setPagAtual(this.getPagAtual()-1);
        }else{
            System.out.println("Você está na primeira página.");
        }
    }
}

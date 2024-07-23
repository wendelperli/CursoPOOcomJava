package exerciciopraticoaula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String livro, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = livro;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    //Métodos getters e Setters:
    public String getTitulo() {
        return this.titulo;
    }

    public void setLivro(String livro) {
        this.titulo = livro;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        this.setPagAtual(p);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1) ;
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1) ;
    }
    public void mostrar(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor()); 
        System.out.println("Total de páginas: " + getTotPaginas());
        System.out.println("Página atual: " + getPagAtual()); 
        System.out.println("Livro está aberto? " + getAberto());
        System.out.println("Leitor: " + getLeitor().getNome());
   
    }
}

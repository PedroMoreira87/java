package secao09.bonus02;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        setPagAtual(0);
        setAberto(false);
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro: " +
                "titulo='" + titulo + '\'' +
                "\n autor='" + autor + '\'' +
                "\n totPaginas=" + totPaginas +
                "\n pagAtual=" + pagAtual +
                "\n aberto=" + aberto +
                "\n leitor=" + leitor.getNome() +
                "\n idade=" + leitor.getIdade() +
                "\n sexo=" + leitor.getSexo();
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p <= getTotPaginas()){
            setPagAtual(p);
        }else{
            System.out.println("ERRO, input maior que número total de páginas");
        }
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);
    }
}

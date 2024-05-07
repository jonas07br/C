public class Livro {
    
    public String toString() {
        return "Livro [titulo=" + titulo + ", Autor=" + Autor + ", anoPubli=" + anoPubli + "]";
    }

    private String titulo;
    private String Autor;
    private int anoPubli;

    public Livro(String titulo, String autor, int anoPubli) {
        this.titulo = titulo;
        Autor = autor;
        this.anoPubli = anoPubli;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }
    
    
}

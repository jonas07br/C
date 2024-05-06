import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Livro> catalogoLivros;

    public Catalogo() {
        this.catalogoLivros = new ArrayList<>();
    }
    public void adicionarLivro(String titulo,String autor,int ano){
        this.catalogoLivros.add(new Livro(titulo,autor,ano));
    }
    public void pesquisaAutor(String autor){
        System.out.println("Livros do autor "+autor+":");
        for(Livro l : catalogoLivros){
            if(l.getAutor().equalsIgnoreCase(autor)){
               System.out.println(l.getTitulo()); 
            }
        }
    }
    public void pesquisaIntervaloAnos(int inicio,int fim){
        System.out.println("Livros entre "+inicio+" e "+fim);
        for(Livro l : catalogoLivros){
            if(l.getAnoPubli()>=inicio && l.getAnoPubli()<=fim){
                System.out.println("Nome:"+l.getTitulo()+"; Autor:"+l.getAutor());
            }
        }
    }
    
    
}

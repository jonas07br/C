import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private double altura;
    private int idade;
    
    public Pessoa(double altura, int idade) {
        this.altura = altura;
        this.idade = idade;
    }
    
    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }

    public String toString() {
        return "Pessoa [altura=" + altura + ", idade=" + idade + "]";
    }

    
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{
    
    public int compare(Pessoa p1, Pessoa p2) {
        
        return Double.compare(p1.getAltura(), p2.getAltura());
        
    }

    
}

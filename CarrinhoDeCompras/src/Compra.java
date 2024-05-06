import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Compra {
    public String nomeItem;
    public double valor;
    public int qtd;

    public Compra(String nomeItem, double valor, int qtd) {
        this.nomeItem = nomeItem;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }

   
    
}

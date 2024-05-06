import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public String nomeItem;
    public double valor;
    public int qtd;

    public CarrinhoDeCompras(String nomeItem, double valor, int qtd) {
        this.nomeItem = nomeItem;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNomeItem() {
        return nomeItem;
    }

   
    
}

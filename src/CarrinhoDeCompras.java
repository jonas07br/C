import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    public List<Compra> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();
    }
    public void adicionarCompra(String nomeItem,double valor,int qtd){
        listaCompras.add(new Compra(nomeItem,valor,qtd));
    }

    public void removerItem(String nomeItem){
        int x=0;
        for(Compra c : listaCompras){
            if(c.getNomeItem().equalsIgnoreCase(nomeItem)){
              listaCompras.remove(x);
              break;  
            }
            x++;
        }
    }
    public double calcularValorTotal(){
        double total=0;
        for(Compra c : listaCompras){
            total+= c.valor*c.qtd;
        }
        return total;
    }
    public void exibirItens(){
        for(Compra c : listaCompras){
            System.out.println("Item:"+c.nomeItem+" /Valor Und:"+c.valor+" /Qtd:"+c.qtd);
        }
    }
}

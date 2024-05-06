import java.util.ArrayList;
import java.util.List;

public class Compras {
    
    public List<CarrinhoDeCompras> carrinhoDeCompras;

    public Compras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }
    public void adicionarCompra(String nomeItem,double valor,int qtd){
        carrinhoDeCompras.add(new CarrinhoDeCompras(nomeItem,valor,qtd));
    }

    public void removerItem(String nomeItem){
        int x=0;
        for(CarrinhoDeCompras c : carrinhoDeCompras){
            if(c.getNomeItem().equalsIgnoreCase(nomeItem)){
              carrinhoDeCompras.remove(x);
              break;  
            }
            x++;
        }
    }
    public double calcularValorTotal(){
        double total=0;
        for(CarrinhoDeCompras c : carrinhoDeCompras){
            total+= c.valor*c.qtd;
        }
        return total;
    }
    public void exibirItens(){
        for(CarrinhoDeCompras c : carrinhoDeCompras){
            System.out.println("Item:"+c.nomeItem+" /Valor Und:"+c.valor+" /Qtd:"+c.qtd);
        }
    }
}

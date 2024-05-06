import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Compra> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();
    }

    public void adicionarCompra(String nomeItem,double valor,int qtd){
        this.listaCompras.add(new Compra(nomeItem,valor,qtd));
    }

    public void removerItem(String nomeItem){
        int x=0;
        List<Compra> compraRemover = new ArrayList<>();
        for(Compra c : listaCompras){
            if(c.getNomeItem().equalsIgnoreCase(nomeItem)){
              compraRemover.add(c);
            }
            x++;
        }
        this.listaCompras.removeAll(compraRemover);
    }

    public double calcularValorTotal(){
        double total=0;
        for(Compra c : listaCompras){
            total+= c.getValor()*c.getQtd();
        }
        return total;
    }
    public void exibirItens(){
        System.out.println("-------SUA LISTA DE COMPRAS---------");
        for(Compra c : listaCompras){
            System.out.println("Item:"+c.getNomeItem()+" /Valor Und:"+c.getValor()+" /Qtd:"+c.getQtd());
            
        }
    }
}

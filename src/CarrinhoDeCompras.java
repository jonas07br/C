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
        
        List<Compra> compraRemover = new ArrayList<>();
        for(Compra c : listaCompras){
            if(c.getNomeItem().equalsIgnoreCase(nomeItem)){
              compraRemover.add(c);
            }
            
        }
        this.listaCompras.removeAll(compraRemover);
    }

    public double calcularValorTotal(){
        if(this.listaCompras.isEmpty()){
            System.out.println("Sua Lista de Compras está vazia:");
            return 0;
        }
        double total=0;
        for(Compra c : listaCompras){
            total+= c.getValor()*c.getQtd();
        }
        return total;
    }
    public void exibirItens(){
        if(!this.listaCompras.isEmpty()){
            System.out.println("-------SUA LISTA DE COMPRAS---------");
            for(Compra c : listaCompras){
                System.out.println("Item:"+c.getNomeItem()+" /Valor Und:"+c.getValor()+" /Qtd:"+c.getQtd());
            }
        }
        else{
            System.out.println("Sua Lista de Compras está vazia:");
        }
        
    }
}


public class Mercado {
    public static void main(String[] args) {        
        CarrinhoDeCompras compra = new CarrinhoDeCompras();
       
        compra.adicionarCompra("Laranja",15,1);
        compra.adicionarCompra("Feijão", 10, 5);
        compra.adicionarCompra("Arroz", 7, 5);
        compra.adicionarCompra("Tomate", 6, 3);
        compra.exibirItens();
        System.out.println("O total é:"+compra.calcularValorTotal());
        compra.removerItem("Laranja");
        compra.removerItem("Arroz");
        compra.exibirItens();
        System.out.println("O total é:"+compra.calcularValorTotal());
        
        
    }
}

public class Mercado {
    public static void main(String[] args) {        
        CarrinhoDeCompras compra = new CarrinhoDeCompras();
        compra.adicionarCompra("Leite", 10, 1);
        compra.adicionarCompra("Carne", 40, 1);
        
        compra.removerItem("Leite");
        
        compra.adicionarCompra("Pão", 3, 1);
        compra.adicionarCompra("Suco",5,4);
        compra.adicionarCompra("Queijo", 10, 3);
        
        compra.removerItem("Pão");
        compra.removerItem("Suco");
        compra.removerItem("Queijo");
        compra.exibirItens();
        System.out.println("Total:"+compra.calcularValorTotal());
    }
}

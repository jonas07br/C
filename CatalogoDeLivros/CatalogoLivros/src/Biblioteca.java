public class Biblioteca {
    public static void main(String[] args) {
        Catalogo lista = new Catalogo();
        System.out.println(" a");
        lista.adicionarLivro("As Cronicas De Narnia", "Jonas", 2001);
        lista.adicionarLivro("As Cronicas De Narnia 2", "Jonas", 2003);
        lista.adicionarLivro("As Cronicas De Narnia 3", "Jonas", 2006);
        lista.pesquisaAutor("Jonas");
    }
}

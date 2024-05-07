public class Listagem {
    public static void main(String[] args) {
        Lista listagem = new Lista();
        listagem.addPessoa(1.5, 20);
        listagem.addPessoa(1.9, 21);
        listagem.addPessoa(1.2, 22);
        listagem.addPessoa(2, 23);
        listagem.addPessoa(2.3, 19);
        System.out.println(listagem.listarPorAltura());
        System.out.println(listagem.listarPorIdade());
    }
}

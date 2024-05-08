import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> listaConvidados;

    public ConjuntoConvidados() {
        this.listaConvidados = new HashSet<>();
    }
    public void addConvidado(String nome,int codConvite){
        listaConvidados.add(new Convidado(nome, codConvite));
    }
    public void removerConvidado(int codConvite){
        Convidado convidadoRemover = null;
        for(Convidado c : listaConvidados){
            if(c.getCodConvite()==codConvite){
                convidadoRemover=c;
                break;
            }
        }
        listaConvidados.remove(convidadoRemover);
    }
    public int contarConvidados(){
        return listaConvidados.size();
    }
    public void exibirConvidados(){
        System.out.println(listaConvidados);
    }
    public static void main(String[] args) {
        ConjuntoConvidados lista = new ConjuntoConvidados();
        lista.addConvidado("Joao", 123);
        lista.addConvidado("Maria", 123);
        lista.addConvidado("Jonas", 12223);
        lista.addConvidado("Pedro", 124443);
        System.out.println(lista.contarConvidados());
        lista.exibirConvidados();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoConvidados other = (ConjuntoConvidados) obj;
        if (listaConvidados == null) {
            if (other.listaConvidados != null)
                return false;
        } else if (!listaConvidados.equals(other.listaConvidados))
            return false;
        return true;
    }
    
}

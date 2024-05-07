import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class Lista {
    private List<Pessoa> listaPessoa;

    public Lista(){
        listaPessoa = new ArrayList<>();
    }
    public void addPessoa(double altura,int idade){
        listaPessoa.add(new Pessoa(altura, idade));
    }
    public List<Pessoa> listarPorIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasIdade);
        return pessoasIdade;

    }
    public List<Pessoa> listarPorAltura(){
        List<Pessoa> pessoasAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasAltura, new ComparatorPorAltura());
        return pessoasAltura;
    }
}

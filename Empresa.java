
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {
    
    List<Funcionario> listaFuncionario;

    public Empresa() {
        listaFuncionario = new ArrayList<>();
    }

    public void addFuncionario(Funcionario f){
        listaFuncionario.add(f);
    }
    
    public Funcionario getFuncionario(int i){
        return listaFuncionario.get(i);
    }

    public List<Funcionario> getFuncionariosBaixos(){
        return listaFuncionario.stream()
        .filter(f -> f.getNascimento().getYear() >= 1975 && f.getNascimento().getYear() <= 1985)
        .filter(f -> f.getSalario() <= 3000)
        .collect(Collectors.toList());
    }

    public List<Funcionario> getTopTrinta(List<Empresa> listaEmpresas){

        List<Funcionario> funcionariosTemp = new ArrayList<>();
        List<Funcionario> top30Funcionarios = new ArrayList<>();

        for (int i = 0; i < listaEmpresas.size(); i++) {
            funcionariosTemp.addAll(listaEmpresas.get(i).listaFuncionario.stream()
            .filter(f -> f.getIdade() < 25)
            .collect(Collectors.toList()));
        }
        top30Funcionarios.addAll(funcionariosTemp);
        top30Funcionarios = top30Funcionarios.stream()
        .sorted((f1 , f2) -> Double.compare(f2.getSalario(), f1.getSalario()))
        .limit(30)
        .collect(Collectors.toList());
        return top30Funcionarios;
    }
}


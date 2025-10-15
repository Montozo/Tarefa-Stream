
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Funcionario f = new Funcionario(2000, LocalDate.of(1999, 12, 11), "jao", 25);

        Empresa e = new Empresa();

        Empresa e2 = new Empresa();

        e.addFuncionario(f);
        e.addFuncionario(new Funcionario(2000, LocalDate.of(1999, 12, 11), "jao" , 24));
        e.addFuncionario(new Funcionario(2000, LocalDate.of(1980, 12, 11), "Carlo" , 23));
        e.addFuncionario(new Funcionario(3000, LocalDate.of(1978, 12, 11), "Musga" , 18));
        e.addFuncionario(f);
        e.addFuncionario(new Funcionario(2000, LocalDate.of(1999, 12, 11), "MARIA" , 30));
        e.addFuncionario(new Funcionario(2000, LocalDate.of(1980, 12, 11), "Carla" , 25));
        e.addFuncionario(new Funcionario(3000, LocalDate.of(1978, 12, 11), "Musguete", 28));
        
        ArrayList<Empresa> listaEmpresas = new ArrayList<>(Arrays.asList(e , e2));
        e.getTopTrinta(listaEmpresas).forEach(System.out::println);
        
    }
}
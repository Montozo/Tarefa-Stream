
import java.time.LocalDate;

class Funcionario {
    private LocalDate dataNascimento;
    private double salario;
    private String nome;
    private int idade;

    public Funcionario(double salario , LocalDate dataNascimento , String nome , int idade) {
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.idade = idade;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getNome(){
        return this.nome;
    }

    public LocalDate getNascimento(){
        return this.dataNascimento;
    }

    public int getIdade(){
        return this.idade;
    }

    @Override
    public String toString(){
        return """
               -----------------------------------------
              Funcionario: """ + nome + "\nNascimento: " + dataNascimento + "\nSalario: " + salario;
    }
}

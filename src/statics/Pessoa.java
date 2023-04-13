package statics;


import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double salario;

    public Pessoa(String nome, LocalDate dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdataNascimento() {
        return Util.formatarData(dataNascimento);
    }

    public void setIdade(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSalario() {
        return Util.formatarBrl(salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}

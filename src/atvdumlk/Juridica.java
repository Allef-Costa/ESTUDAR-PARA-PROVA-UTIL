package atvdumlk;

import java.time.LocalDate;


public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorContrato;

    @Override
    public String toString() {
        return "ID:" + super.id + 
                "Nome:" + super.nome + 
                "Genero" + super.genero.MASCULINO + 
                "Enderereço" + super.endereco.cep + "\n" +
                super.endereco.cidade + "\n" + super.endereco.complemento + "\n" +
                super.endereco.logradouro + "\n" + super.endereco.numero + "\n" +
                super.endereco.uf + 
                "\ncnjp" + cnpj +
                "\nInscrição Estadual" + inscricaoEstadual + 
                "\nData de Inicio" + dataInicio + 
                "\nData de Termino" + dataTermino + 
                "\nValor do contrato" + valorContrato;
    }

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    public Juridica() {
    }

    public String getCnjp() {
        return cnpj;
    }

    public void setCnjp(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
    
}

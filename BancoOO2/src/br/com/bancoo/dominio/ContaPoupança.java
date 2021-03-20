package br.com.bancoo.dominio;

public class ContaPoupança extends Conta{

    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public void resgatar (Conta conta, Double valor){


    }
}

package br.com.bancoo.dominio;

public class Conta {
    private String numero;
    private double saldo = new Double(0.0);
    private Cliente cliente;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(Double valor) {
        this.saldo = this.saldo + valor;
    }

    public void retirar(Double valor) {
        this.saldo = this.saldo - valor;
    }
}

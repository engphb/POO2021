package br.com.bancoo.dominio;

public class ContaCorrente extends Conta{

    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir (Conta conta, Double valor){
        if (this.getSaldo()>=valor){
            this.retirar(valor);
            conta.depositar(valor);

        }

    }
    public void receber (Conta conta, Double valor){

    }

}

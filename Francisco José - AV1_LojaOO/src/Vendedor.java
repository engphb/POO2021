import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class Vendedor extends Pessoa{
    private Double salario;
    private Double percentual_Comissão;
    private Collection<Pedido> pedidos = new ArrayList<>();

    public Vendedor(String nome, String cpf, Double salario, Double percentualComissao) {
        this.setNome(nome);
        this.salario = salario;
        this.percentual_Comissão = percentualComissao;
        if (validarCPF(cpf)) {
            this.setCpf(cpf);
            System.out.println("CPF do vendedor é válido");
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido!");
        }
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getPercentual_Comissão() {
        return percentual_Comissão;
    }

    public void setPercentual_Comissão(Double percentual_Comissão) {
        this.percentual_Comissão = percentual_Comissão;
    }

    public Collection<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Collection<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}

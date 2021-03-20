    import javax.swing.*;
    import java.util.ArrayList;
    import java.util.Collection;

    public class Cliente extends Pessoa{
                private Boolean vip;
                private Pessoa pessoa;
                private Endereço Endereço;
                private Collection<Endereço> endereçoCliente = new ArrayList<>();
                private Collection<Pedido> pedidos = new ArrayList<>();

            public Boolean isVip(boolean b) {
                    return vip;
                }

                public void setVip(Boolean vip) {
                    this.vip = vip;
                }

                public Pessoa getPessoa() {
                    return pessoa;
                }

                public void setPessoa(Pessoa pessoa) {
                    this.pessoa = pessoa;
                }

                //Criação do método que recebe os parâmetros nome, cpf e vip:

                public void cadastro(String nome, String cpf, Boolean vip) {
                    this.setNome(nome);
                    if (validarCPF(cpf)) {
                        this.setCpf(cpf);
                        System.out.println("CPF do cliente é válido");
                    } else {
                        JOptionPane.showMessageDialog(null, "CPF do cliente inválido!");
                    }
                    this.vip = vip;
                }

                // Criação do método listarEndereços

                public void listarEndereços(Cliente cliente){
                    Integer numeroDeEnder = 1;
                    for (Endereço endereço : endereçoCliente) {
                        System.out.println("Endereço " + numeroDeEnder + ":\n" +
                                endereço.getLogradouro() + ", " + endereço.getNumero() + ", "
                                + endereço.getBairro()
                                + ", " + endereço.getComplemento() + "\n" + endereço.getCidade() +
                                "\n" + endereço.getUF() + "\n" +
                                "CEP: " + endereço.getCep());
                        numeroDeEnder++;
                    }

                }


        public Endereço getEndereço() {
            return Endereço;
        }

        public void setEndereço(Endereço endereço) {
            Endereço = endereço;
        }

        public Collection<Pedido> getPedidos() {
            return pedidos;
        }

        public void setPedidos(Pedido pedidos) {
            this.pedidos.add(pedidos);
        }

        public Collection<Endereço> getEndereçoCliente() {
            return endereçoCliente;
        }

        public void setEndereçoCliente(Endereço endereçoCliente) {
            this.endereçoCliente.add(endereçoCliente);
        }

    }
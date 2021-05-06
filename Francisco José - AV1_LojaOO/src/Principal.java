    import java.text.NumberFormat;
    import java.util.Date;

    public class Principal {
            public static void main(String[] args){
                //Declaração e inicialização de um objeto chamado cliente
                //O objeto é da classe Cliente
                //Atribuindo valores aos atributos do objeto
                Cliente cliente = new Cliente();
                cliente.setNome("Francisco");
                cliente.setCpf("02805963322");
                cliente.isVip(false);

                //Instanciando 2 objetos do tipo Endereco e vinculando esses endereços ao objeto Cliente
                Endereço endereço1 = new Endereço("22250-040", "Praia de Botafogo",
                        "460","apartamento 100", "Botafogo",
                        "Rio de Janeiro", "RJ");

                Endereço endereço2 = new Endereço("64045-050", "Rua Levindo José Carneiro",
                        "1966","conjunto Jardim das Acacias",
                        "Reis Veloso", "Parnaíba", "PI");

                cliente.setEndereçoCliente(endereço1);
                cliente.setEndereçoCliente(endereço2);
                cliente.listarEndereços(cliente);

                //Instanciamento do objeto do tipo Vendedor com nome, cpf, salário, comissão
                Vendedor vendedor = new Vendedor("João", "000910529361",
                        2000.00, 0.15);

                //Chamando o método validarCPF (feito na classe Cliente)

                //Instanciamento de 3 objetos do tipo Produto
                Produto prod1 = new Produto("Notebook", 3000.00);
                Produto prod2 = new Produto("SSD", 417.90);
                Produto prod3 = new Produto("Monitor", 883.40);

                //Instanciamento de um pedido preenchendo os atributos código e data
                Pedido pedido = new Pedido("01", new Date());

                // Pedido: 3 quantidades do prod1, 5 do prod2 e 10 do prod3, criar um objeto do tipo ItemPedido

                ItemPedido item1 = new ItemPedido();
                ItemPedido item2 = new ItemPedido();
                ItemPedido item3 = new ItemPedido();
                item1.setProduto(prod1);
                item1.setQuantidade(3.0);
                item2.setProduto(prod2);
                item2.setQuantidade(5.0);
                item3.setProduto(prod3);
                item3.setQuantidade(10.0);

                pedido.setItensPedidos(item1);
                pedido.setItensPedidos(item2);
                pedido.setItensPedidos(item3);
                pedido.setCliente(cliente);
                pedido.setVendedor(vendedor);

                System.out.println("Valor total do pedido: " +
                        NumberFormat.getCurrencyInstance().format(pedido.calcularTotal(pedido)));
            }

            }

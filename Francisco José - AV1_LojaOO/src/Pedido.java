import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Pedido{
    private String codigo;
    private Date data;
    private Collection<ItemPedido> itensPedidos = new ArrayList<>();
    private Vendedor vendedor;
    private Cliente cliente;

    public Pedido(String codigo, Date data) {
        this.codigo = codigo;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void calcularTotal (){

    }
    public Collection<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(ItemPedido itensPedidos) {
        this.itensPedidos.add(itensPedidos);
    }

        public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Criação do método método calcularTotal() da classe Pedido

    public double calcularTotal(Pedido pedido) {
        double total = 0;
        for (ItemPedido itemPedido : itensPedidos){
            total = total + itemPedido.getQuantidade() * itemPedido.getProduto().getPreço();
        }
        return total;
    }
}



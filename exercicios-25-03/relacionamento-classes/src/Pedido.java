import java.util.ArrayList;
public class Pedido{

    private Cliente cliente;
    private ArrayList<ItemPedido> itens;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<ItemPedido>();
    }

    
    public void adicionarItem(String descricao, int quantidade){
        ItemPedido novoItem = new ItemPedido(descricao, quantidade);
        this.itens.add(novoItem);
    }

    public ArrayList<ItemPedido> getItens(){
        return itens;
    }

    
}
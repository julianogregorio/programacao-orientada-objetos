public class Pedido{
    
    private ArrayList<ItemPedido> itens;

    public Pedido(){
        
        this.itens = new ArrayList <>();

        itens.add(new ItemPedido ("Notebook", 1));
        itens.add(new ItemPedido ("Mouse", 1));


    }

}
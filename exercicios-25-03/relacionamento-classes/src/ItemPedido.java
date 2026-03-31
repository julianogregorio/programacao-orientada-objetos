public class ItemPedido {
    private String descricao;
    private int quantidade;

    public ItemPedido(String descricao, int quantidade){
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    public String getDescricao(){
        return descricao;
    }
    public int getQuantidade(){
        return quantidade;
    }
    
}

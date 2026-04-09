public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente("Alberto");
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarItem("Lápis", 1);

        System.out.println("Pedido criado para : " + cliente1.getNome());
        for (ItemPedido item : pedido1.getItens()) {
            System.out.println(item.getDescricao() + " - quantidade: " + item.getQuantidade());
        }
        Cliente cliente2 = new Cliente("Bruno");
        Pedido pedido2 = new Pedido(cliente2);
        pedido2.adicionarItem("Caderno", 1);
        pedido2.adicionarItem("Borracha", 1);

        System.out.println("Pedido criado para : " + cliente1.getNome());
        for (ItemPedido item : pedido1.getItens()) {
            System.out.println(item.getDescricao() + " - quantidade: " + item.getQuantidade());
        }
        System.out.println("Pedido criado para : " + cliente2.getNome());
        for (ItemPedido item : pedido2.getItens()) {
            System.out.println(item.getDescricao() + " - quantidade: " + item.getQuantidade());
        }

        Time time1 = new Time ("Napoli");
        Jogador jogador1 = new Jogador("Maradona");
        time1.adicionarJogador(jogador1);
        Jogador jogador2 = new Jogador("Careca");
        time1.adicionarJogador(jogador2);

        Time time2 = new Time ("Atalanta");
        Jogador jogador3 = new Jogador("Caniggia");
        time2.adicionarJogador(jogador3);
        Jogador jogador4 = new Jogador("Evair");
        time2.adicionarJogador(jogador4);

        System.out.println("Time: " + time1.getTime());
        for (Jogador jogador : time1.getJogadores()) {
            System.out.println(jogador.getNome());
        }

        System.out.println("Time: " + time2.getTime());
        for (Jogador jogador : time2.getJogadores()) {  
            System.out.println(jogador.getNome());
        }  

        Agenda agenda1 = new Agenda("Trabalho");
        agenda1.addContato ("André", "+11 11111-1111");
        agenda1.addContato ("Bruno", "+22 22222-2222");

        System.out.println("Agenda: " + agenda1.getNomeAgenda());
        for (Contato contato : agenda1.getContato()) {
            System.out.println("Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
        }   

    }
}

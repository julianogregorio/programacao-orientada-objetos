import java.util.ArrayList;
public class Agenda {
    private String nomeAgenda;
    private ArrayList<Contato> contato; 

    public Agenda (String nomeAgenda){
        this.nomeAgenda = nomeAgenda;
        this.contato = new ArrayList <Contato>();
    }

    public void addContato(String nome, String telefone){
        Contato novoContato = new Contato (nome, telefone);
        this.contato.add(novoContato);
    }


    public String getNomeAgenda(){
        return nomeAgenda;
    }

    public ArrayList<Contato> getContato(){
        return contato;
    }


}

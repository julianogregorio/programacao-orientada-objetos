import java.util.ArrayList;
public class Time {

    private String time;
    private ArrayList<Jogador>jogador;

    public Time(String time){
        this.time = time;
        this.jogador = new ArrayList<Jogador>();    
    }

    public void adicionarJogador(Jogador jogador){
        this.jogador.add(jogador);
    }

    public String getTime(){
        return time;
    }

     public ArrayList<Jogador> getJogadores(){
        return jogador;
     }

    
}

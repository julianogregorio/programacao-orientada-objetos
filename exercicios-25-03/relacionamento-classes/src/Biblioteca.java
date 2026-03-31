import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro>livro;

    public Biblioteca(String nome){
        this.nome = nome;
        this.livro = new ArrayList<Livro>();    
    }

    public void adicionarLivro(Livro livro){
        this.livro.add(livro);
    }

    
    public String getBiblioteca(){
        return nome;
    }

     public ArrayList<Livro> getLivro(){
        return livro;
     }

}

import java.util.ArrayList;
public class Livro {
    
    private String titulo;
    private ArrayList<Autor>autor;

    public Livro(String titulo){
        this.titulo = titulo;
        this.autor = new ArrayList<>();
    }

    public void adicionarAutor(Autor autor){
        this.autor.add(autor);
    }

    public String getTitulo(){
        return titulo;
    }

     public ArrayList<Autor> getAutor(){
        return autor;
     }
}

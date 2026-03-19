public class Pessoa{
    
    private String nome;
    private int idade;
    
    /* 
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;       
    }
    */

    public Pessoa(String nome, int idade){
        this.nome = nome;
        setIdade(idade);       
    }

    public void setIdade(int idade){
        if(idade > 0 && idade <= 100)
         {
            this.idade = idade;
        }
        else
        {
            System.out.println("Idade inválida. A idade deve ser entre 1 e 100.");
            this.idade = 0; 
        }
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

}
public class Peixe extends Animal implements Nadador{

    public Peixe(String nome){
        super(nome);
    }

    @Override 
    public void emitirSom(){
        System.out.println("Glub, glub!");
    }

    @Override
    public void nadar(){
        System.out.println("O peixe nada!");
    }

}
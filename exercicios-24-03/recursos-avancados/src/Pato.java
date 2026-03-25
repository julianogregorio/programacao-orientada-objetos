public class Pato extends Animal implements Voador, Nadador{
    
    public Pato(String nome){
        super(nome);
    }
    
    @Override
    public void emitirSom(){

        System.out.println("Quá, Quá, Quá!");

    }

    @Override
    public void voar(){
        System.out.println("O pato voa!");
    }

    @Override
    public void nadar(){
        System.out.println("O pato nada!");
    }

}
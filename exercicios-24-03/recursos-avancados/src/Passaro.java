public class Passaro extends Animal implements Voador{

    public Passaro (String nome){
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu, piu!");
    }

    @Override
    public void voar() {
        System.out.println("O pássaro voa!");
    }

}
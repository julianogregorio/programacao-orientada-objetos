public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro ("Rex");
        c.emitirSom(); 

        Pato p = new Pato ("Donald");
        p.emitirSom();
        p.voar();
        p.nadar();

        Passaro passaro = new Passaro ("Canário");
        passaro.emitirSom();
        passaro.voar();

        Peixe peixe = new Peixe ("Peixonauta");
        peixe.emitirSom();
        peixe.nadar();
    }
}

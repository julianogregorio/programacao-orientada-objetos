public abstract class Instrumento {
    
    String marca;
    String tipo;

    public Instrumento(String marca, String tipo){
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getTipo() {
        return tipo;
    }

}

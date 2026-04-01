public class App {
    public static void main(String[] args) throws Exception {
        
        //TRATAMENTO DE EXCEÇÕES

        int a = 10;
        int b = 0;

        try{
            int resultado = a/b; //Isso vai lançar ArithmeticException
            System.out.println("Resultado: "+ resultado);  
        }catch(ArithmeticException e){
            System.out.println("Erro: Divisão por zero não é permita");
            System.out.println("Mensagem da JVM: "+ e.getMessage());
        }finally{
            System.out.println("Bloco finally sempre executado");
        }
        System.out.println("Programa continua normalmente...");


    }
}

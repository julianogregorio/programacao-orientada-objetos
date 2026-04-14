public class App {
    public static void main(String[] args) throws Exception {

        
        ContaBancaria conta = new ContaBancaria(111, "Andre", 500.0, true);

        try {
            conta.depositar(200);
            System.out.println("Depósito realizado. Saldo: " + conta.getSaldo());

            conta.sacar(100);
            System.out.println("Saque realizado. Saldo: " + conta.getSaldo());

            conta.sacar(1000); // saldo insuficiente
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ContaInativaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        conta.desativarConta();
        try {
            conta.sacar(50); // conta inativa
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


    }


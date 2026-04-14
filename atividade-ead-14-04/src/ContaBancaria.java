public class ContaBancaria{
    private int numero;
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(int numero, String titular, double saldo, boolean ativa) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    public void sacar(double valor) throws SaldoInsuficienteException, ContaInativaException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido para saque.");
        }
        if (!ativa) {
            throw new ContaInativaException("Conta está inativa.");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido para depósito.");
        }
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void desativarConta() {
        ativa = false;
    }

    public void ativarConta() {
        ativa = true;
    }

}
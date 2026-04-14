public class Voo {
    private int numeroVoo;
    private int assentosDisponiveis;
    private double valorPassagem;
    private boolean cancelado;

    public Voo(int numeroVoo, int assentosDisponiveis, double valorPassagem) {
        this.numeroVoo = numeroVoo;
        this.assentosDisponiveis = assentosDisponiveis;
        this.valorPassagem = valorPassagem;
        this.cancelado = false;
    }

    public void reservarAssento(int quantidade, double valorPago) 
            throws VooLotadoException, VooCanceladoException {
        if (quantidade <= 0) {
            throw new ValorInvalidoException("Quantidade inválida de assentos.");
        }
        if (cancelado) {
            throw new VooCanceladoException("O voo já foi cancelado.");
        }
        if (quantidade > assentosDisponiveis) {
            throw new VooLotadoException("Não há assentos suficientes disponíveis.");
        }
        if (valorPago < quantidade * valorPassagem) {
            throw new ValorInvalidoException("Valor pago insuficiente para a reserva.");
        }
        assentosDisponiveis -= quantidade;
        System.out.println("Reserva realizada com sucesso! Assentos restantes: " + assentosDisponiveis);
    }

    public void cancelarVoo() throws VooCanceladoException {
        if (cancelado) {
            throw new VooCanceladoException("O voo já está cancelado.");
        }
        cancelado = true;
        System.out.println("Voo cancelado com sucesso.");
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public boolean isCancelado() {
        return cancelado;
    }
}
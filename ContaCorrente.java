class ContaCorrente extends Conta {

    public ContaCorrente(PessoaFisica cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

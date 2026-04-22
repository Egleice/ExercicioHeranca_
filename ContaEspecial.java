class ContaEspecial extends Conta {
    protected double limite;

    public ContaEspecial(PessoaFisica cliente, double saldo, double limite) {
        super(cliente, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

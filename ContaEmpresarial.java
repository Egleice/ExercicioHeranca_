class ContaEmpresarial extends Conta {
    private double limite;

    public ContaEmpresarial(PessoaJuridica cliente, double saldo, double limite) {
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

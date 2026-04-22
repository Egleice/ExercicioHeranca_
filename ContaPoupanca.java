public class ContaPoupanca extends Conta {

    public ContaPoupanca(PessoaFisica cliente, double saldo) {
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

    public void rendimento() {
        saldo += saldo * 0.005;
    }
}

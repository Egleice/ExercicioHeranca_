public abstract class Conta {
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public abstract boolean sacar(double valor);

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

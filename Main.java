public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Gabriel");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100.0, (IConta) poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

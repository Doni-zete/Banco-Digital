public class Main {

    public static void main(String[] args) {
        Cliente Donizete = new Cliente();
        Donizete.setNome("Donizete");


        Conta cc = new ContaCorrente(Donizete);
        Conta poupanca= new ContaPoupanca(Donizete);
        
        cc.depositar(300);
        cc.transferir(150, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

package Exercicio4;

public class Banco {

	public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456", 1000.0);

        conta.verSaldo();
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.verSaldo();
	}

}

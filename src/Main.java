
public class Main {

	public static void main(String[] args) {
		Cliente clayton = new Cliente();
		clayton.setNome("Clayton");
		clayton.setTipo("pf");
		clayton.setCpf("520.188.760-07");

		Cliente felipe = new Cliente();
		felipe.setNome("Felipe");
		felipe.setTipo("pj");
		felipe.setCnpj("44.733.119/0001-49");
		
		Conta cc1 = new ContaCorrente(clayton);
		Conta poupanca1 = new ContaPoupanca(clayton);
		
		cc1.depositar(100);
		cc1.transferir(100, poupanca1);		
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();

		Conta cc2 = new ContaCorrente(felipe);
		Conta poupanca2 = new ContaPoupanca(felipe);
		
		cc2.depositar(500);
		cc2.transferir(100, poupanca2);		
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}

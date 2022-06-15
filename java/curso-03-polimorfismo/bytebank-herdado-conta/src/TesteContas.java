
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposita(200.0);
		
		// O método transfere foi definido na classe mãe, mas o polimorfismo faz que ele atue de forma específica
		// para o tipo do objeto que está chamando, no caso uma ContaCorrente onde há cobrança de taxa.
		contaCorrente.transfere(10, contaPoupanca);
		
		System.out.println("CC: " + contaCorrente.getSaldo());
		System.out.println("CP: " + contaPoupanca.getSaldo());
		
	}

}


public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposita(200.0);
		
		// O m�todo transfere foi definido na classe m�e, mas o polimorfismo faz que ele atue de forma espec�fica
		// para o tipo do objeto que est� chamando, no caso uma ContaCorrente onde h� cobran�a de taxa.
		contaCorrente.transfere(10, contaPoupanca);
		
		System.out.println("CC: " + contaCorrente.getSaldo());
		System.out.println("CP: " + contaPoupanca.getSaldo());
		
	}

}


public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDaAna = new Conta();
		
		contaDaAna.saldo = 100;
		contaDaAna.titular = "Ana Milanezi";
		System.out.println("Saldo inicial de " + contaDaAna.titular + " � " + contaDaAna.saldo);
		
		contaDaAna.deposita(50);
		System.out.println("Saldo de Ana ap�s primeiro dep�sito: " +contaDaAna.saldo);
		
		boolean sucessoDoSaque = contaDaAna.saca(200); // "Saldo insuficiente"
		
		System.out.println("Foi poss�vel sacar 200? " + sucessoDoSaque); // false
		
		sucessoDoSaque = contaDaAna.saca(50); 
		
		System.out.println("Foi poss�vel sacar 50? " + sucessoDoSaque); // true

		
		Conta contaDoLuan = new Conta();
		contaDoLuan.deposita(1000);
		
		contaDoLuan.transfere(300, contaDaAna);
		System.out.println("Saldo Luan ap�s transfer�ncia: " + contaDoLuan.saldo);
		System.out.println("Saldo da Ana ap�s transfer�ncia: " + contaDaAna.saldo);
	}
}

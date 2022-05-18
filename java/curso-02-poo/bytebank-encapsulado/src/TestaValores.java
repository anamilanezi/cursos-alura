
public class TestaValores {
	
	public static void main(String[] args) {
		// Conta() invoca um construtor, definido na classe
		Conta conta = new Conta(18, 1546);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(-50);
		conta.setNumero(-1387);
		conta.setAgencia(123123);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1224, 49486);
		Conta conta3 = new Conta(1212, 21215);
		
		
	}
 
}

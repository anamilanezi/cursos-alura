
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(18, 25485);
	 /* conta.numero = 1377;
	  * N�o compila pois o atributo n�mero est� privado */
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		// paulo.nome = "Paulo Silveira"
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome()); // Paulo Silveira
		
		conta.getTitular().setProfissao("programador");
	}
	
}

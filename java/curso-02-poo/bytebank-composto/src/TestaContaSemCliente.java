
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo()); // 0 por padr�o
		
		System.out.println(contaDaMarcela.titular); // null
		
		/* 	
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		Se o c�digo fosse escrito nessa posi��o: ERRO pois n�o existe 
		um cliente na mem�ria pra poder acessar o nome
		
		*/
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		
	}

}

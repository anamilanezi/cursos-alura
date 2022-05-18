
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo()); // 0 por padrão
		
		System.out.println(contaDaMarcela.titular); // null
		
		/* 	
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		Se o código fosse escrito nessa posição: ERRO pois não existe 
		um cliente na memória pra poder acessar o nome
		
		*/
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		
	}

}

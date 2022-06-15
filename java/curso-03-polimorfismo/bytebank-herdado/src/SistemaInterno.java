// Criar um sistema onde somente funcion�rios autentic�veis tem acesso
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso liberado");
		} else {
			System.out.println("Acesso negado");
		}
	}
}



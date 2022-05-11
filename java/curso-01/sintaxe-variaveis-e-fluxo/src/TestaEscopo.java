
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 3;
		
		// Vari�vel declarada dentro de chaves tem seu escopo limitado a esse espa�o, 
		// por isso deve ser declarada antes de if. Vari�vel declarada mas n�o inicializada
		// n�o possui um valor padr�o (n�o compila sem inicializar)
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
}

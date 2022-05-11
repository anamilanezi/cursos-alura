
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 3;
		
		// Variável declarada dentro de chaves tem seu escopo limitado a esse espaço, 
		// por isso deve ser declarada antes de if. Variável declarada mas não inicializada
		// não possui um valor padrão (não compila sem inicializar)
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}

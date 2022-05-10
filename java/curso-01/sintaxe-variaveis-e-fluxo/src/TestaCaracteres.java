
public class TestaCaracteres {
	public static void main(String[] args) {
		
		char letra ='a';
		
		System.out.println(letra);
		
		char valor = 66; // char recebe na verdade um valor unicode, podendo ser o int que representa o caractere
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		// String não é variável primitiva
		
		String frase = "Feliz ano novo";
		System.out.println(frase);
		
		frase = frase + 2022;
		System.out.println(frase);

	}

}

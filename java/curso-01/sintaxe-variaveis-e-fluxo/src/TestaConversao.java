
public class TestaConversao {
	public static void main(String[] args) {
		// Um int pode ser convertido em double mas o contrário não:
		// double salario = 1270.50;
		// int valor = salario;
		
		// Para forçar a conversão, faz-se o casting 
		
		double salario = 1250.70;
		int valor = (int) salario;
		
		System.out.println(valor);
		
		// Tipos numéricos
		float pontoFlutuante = 3.15f;
		int numeroInt; // 32bits
		long numeroGrande = 6546546565465465465L; // numeros com 64bits
		short valorPequeno; // numeros com 16 bits
		byte b;

		// Contas com double:
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		System.out.println("Em java, a soma de 0.2 e 0.1 resulta em " + (valor1 + valor2));
		
	}

}

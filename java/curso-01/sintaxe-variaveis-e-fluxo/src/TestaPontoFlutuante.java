
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		
		System.out.println("Meu sal�rio � " + salario);
		
		double idade = 31;
		
		double divisao = 3.14 / 2; 
		
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		
		System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2;	// Java primeiro realiza o que est� na direita, interpreta como dois n int e depois atribui � vari�vel, por isso o resultado = 2.0
		
		System.out.println(novaTentativa);
		
		novaTentativa = 5.0 / 2;
		
		System.out.println(novaTentativa);
	}
}

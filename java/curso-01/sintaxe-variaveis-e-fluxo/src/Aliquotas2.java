
public class Aliquotas2 {
	
	public static void main(String[] args) {
		// Minha vers�o
		// De 1900.0 at� 2800.0 o IR � de 7.5% e pode deduzir R$ 142
        // De 2800.01 at� 3751.0 o IR � de 15% e pode deduzir R$ 350
        // De 3751.01 at� 4664.00 o IR � de 22.5% e pode deduzir R$ 636
	
		double salario = 3300.0;
		double aliquota = 0;
		int valorDeducao = 0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			aliquota = 7.5;
			valorDeducao = 142;
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			aliquota = 15;
			valorDeducao = 350;
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			aliquota = 22.5;
			valorDeducao = 636;
		}
		
		System.out.println("Sua aliquota � de " + aliquota + "% e o valor a ser deduzido � R$" + valorDeducao);
	}
}

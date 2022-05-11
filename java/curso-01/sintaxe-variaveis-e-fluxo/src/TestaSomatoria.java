
public class TestaSomatoria {

	public static void main(String[] args) {
		
		int contador = 0;
		int somaTotal = 0;
		
		while(contador <= 10) {
			somaTotal += contador;
			contador++;
		}
		
		System.out.println(somaTotal);
	}
}

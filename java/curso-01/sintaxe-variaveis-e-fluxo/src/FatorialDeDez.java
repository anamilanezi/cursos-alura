
public class FatorialDeDez {

	public static void main(String[] args) {
		int total = 1;
		
		for(int contador = 10; contador > 0; contador--) {
			total *= contador;
		}
		
		System.out.println("10! = " + total);
	}
	
}

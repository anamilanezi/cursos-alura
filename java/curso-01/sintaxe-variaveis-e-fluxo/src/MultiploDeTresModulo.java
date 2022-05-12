
public class MultiploDeTresModulo {
	
	public static void main(String[] args) {
		
		System.out.print("M(3) = {");
		
		for(int ehMultiplo = 1; ehMultiplo <= 100; ehMultiplo++) {
			if(ehMultiplo % 3 == 0) {
				System.out.print(ehMultiplo + ", ");
			}
		}
		
		System.out.print("}");
		
	}
	
}

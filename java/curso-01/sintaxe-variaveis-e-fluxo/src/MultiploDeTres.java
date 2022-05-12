
public class MultiploDeTres {

	public static void main(String[] args) {

		System.out.print("M(3) = {");
		
		int ehMultiplo = 0;
		int contador = 1;
		
		while (ehMultiplo < 99) {
			ehMultiplo = contador * 3;
			System.out.print(ehMultiplo + ", ");
			contador++;
		}
		
		System.out.print("}");

	}
	
}

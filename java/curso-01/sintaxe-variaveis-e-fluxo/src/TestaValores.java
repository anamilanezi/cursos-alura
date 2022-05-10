
public class TestaValores {
	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		
		System.out.println(segundo); // 7
		
		segundo = primeiro;
		System.out.println(segundo); // 5
		
		primeiro = 10;
		
		System.out.println(segundo); // 5
		
	}
}

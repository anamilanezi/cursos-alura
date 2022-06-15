
public class MultiCatch {
	public static void main(String[] args) {
		
//		try {
//		    System.out.println(1/0);
//		} catch(ArithmeticException ex) {
//		    ex.printStackTrace();
//		} catch(NullPointerException ex) {
//		    ex.printStackTrace();    
//		}
		
		try {
		    System.out.println(1 / 0);
		} catch (ArithmeticException | NullPointerException ex) {
		    ex.printStackTrace();
		}
		
	}
}

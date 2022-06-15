
public class PrincipalFluxo {
	public static void main(String[] args) {

        String nome = "Alura";
        System.out.println("ANTES");

        try {
            System.out.println(nome);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("CATCH");
        }

        System.out.println("DEPOIS");
    }
}

// Nenhum erro acontece e a condição catch não será chamada
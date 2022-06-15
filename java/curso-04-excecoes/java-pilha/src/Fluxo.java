public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException  ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("Deu muito errado");
        
        //System.out.println("Fim do metodo2");
    }
}

// O bloco try sinaliza que tem algo "perigoso"
// E se acontece uma exce��o, ent�o captura essa exce��o e executa o bloco catch 
// caso a exce��o seja do tipo "ArithmeticException"	
public class TesteReferencias { 
	
    public static void main(String[] args) {
    	
        Conta primeiraConta = new Conta(); 
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        
        // Ao atribuir a uma variável, cria uma referência ao objeto, e não um objeto em si,
        // então ambas se referem ao MESMO objeto.
        
        Conta segundaConta = primeiraConta;

        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo); 

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("é a mesma conta");                
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);                            
    }
}
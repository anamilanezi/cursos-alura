public class TesteReferencias { 
	
    public static void main(String[] args) {
    	
        Conta primeiraConta = new Conta(); 
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        
        // Ao atribuir a uma vari�vel, cria uma refer�ncia ao objeto, e n�o um objeto em si,
        // ent�o ambas se referem ao MESMO objeto.
        
        Conta segundaConta = primeiraConta;

        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo); 

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("� a mesma conta");                
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);                            
    }
}
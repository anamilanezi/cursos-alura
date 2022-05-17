
public class CriaConta {
	public static void main(String[] args) {
		
		// A vari�vel primeiraConta possui uma REFER�NCIA a um objeto Conta, e n�o o objeto em si
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		// Quando o java instancia objetos, todos seus atributos s�o zerados por padr�o,
		// exceto se um valor diferente for definido na cria��o da classe (em Conta.java)
		
		System.out.println(primeiraConta.agencia);  // 42 - foi definido na classe
		System.out.println(primeiraConta.numero);   // 0 - n�o foi definido, valor padr�o
		
		segundaConta.agencia = 24;
		
		System.out.println("Agora a segunda conta est� na agencia " + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("S�o a mesma conta");
        } else {
            System.out.println("S�o contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
	}
}

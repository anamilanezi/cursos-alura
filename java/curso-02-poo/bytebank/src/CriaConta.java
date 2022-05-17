
public class CriaConta {
	public static void main(String[] args) {
		
		// A variável primeiraConta possui uma REFERÊNCIA a um objeto Conta, e não o objeto em si
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		// Quando o java instancia objetos, todos seus atributos são zerados por padrão,
		// exceto se um valor diferente for definido na criação da classe (em Conta.java)
		
		System.out.println(primeiraConta.agencia);  // 42 - foi definido na classe
		System.out.println(primeiraConta.numero);   // 0 - não foi definido, valor padrão
		
		segundaConta.agencia = 24;
		
		System.out.println("Agora a segunda conta está na agencia " + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("São a mesma conta");
        } else {
            System.out.println("São contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
	}
}

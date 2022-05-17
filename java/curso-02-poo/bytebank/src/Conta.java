// Atributos de uma conta: 

class Conta { 
    double saldo;
    int agencia = 42;
    int numero;
    String titular;
   
// M�TODOS
    
/* - Void indica que n�o existe retorno
   - Queremos que saldo seja relacionado � conta que  est� evocando o m�todo
  deposita(), para isso, faremos uso da palavra-chave this. */
    
    public void deposita(double valor) {
    	
    	this.saldo += valor;
    }
    
/* Esse m�todo retorna um booleano para indicar o sucesso da a��o */ 
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		System.out.println("Saque realizado com sucesso!");
    		return true;
    	} else {
    		System.out.println("Saldo insuficiente");
    		return false;
    	}
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if (this.saldo >= valor) {
    		this.saca(valor);
    		destino.deposita(valor);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    
}
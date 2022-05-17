// Atributos de uma conta: 

class Conta { 
    double saldo;
    int agencia = 42;
    int numero;
    String titular;
   
// MÉTODOS
    
/* - Void indica que não existe retorno
   - Queremos que saldo seja relacionado à conta que  está evocando o método
  deposita(), para isso, faremos uso da palavra-chave this. */
    
    public void deposita(double valor) {
    	
    	this.saldo += valor;
    }
    
/* Esse método retorna um booleano para indicar o sucesso da ação */ 
    
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
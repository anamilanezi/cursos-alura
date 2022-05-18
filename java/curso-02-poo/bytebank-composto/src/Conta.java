// Atributos de uma conta: 

class Conta { 
    private double saldo;
    int agencia = 42;  
    int numero; 	  // 0 por padrão	
    Cliente titular;   // null por padrão
   
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
    
/* Esse método permite verificar o saldo em um programa externo */    
    public double getSaldo() { 
        return this.saldo;
    }
    
    
}
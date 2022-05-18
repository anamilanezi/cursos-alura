// Atributos de uma conta: 

class Conta { 
    private double saldo;
    private int agencia;  
    private int numero; 	  // 0 por padrão	
    private Cliente titular;   // null por padrão
    private static int total;   /* para contar novas contas instanciadas, 
    							 * STATIC diz que é uma instância da CLASSE, não do objeto */
   
    // Construtor dita o que é obrigatório ao criar um novo objeto
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("O total de contas abertas é " + total);
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Estou criando uma conta " + agencia + "-" + numero);
    }
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
    
/* verificar o saldo em um programa externo */    
    public double getSaldo() { 
        return this.saldo;
    }

/* verificar o número da conta em um programa externo */    
   
    public int getNumero() {
    	return this.numero;
    }
/* definir um novo número de conta */
    public void setNumero(int numero) {
    	this.numero = numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if(agencia <= 0) {
    		System.out.println("Não pode valor negativo");
    		return;
    	}
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
		return this.titular;
	}
    
    public static int getTotal() {   // método da CLASSE
    	return Conta.total;
    }
}
// Atributos de uma conta: 

class Conta { 
    private double saldo;
    private int agencia;  
    private int numero; 	  // 0 por padr�o	
    private Cliente titular;   // null por padr�o
    private static int total;   /* para contar novas contas instanciadas, 
    							 * STATIC diz que � uma inst�ncia da CLASSE, n�o do objeto */
   
    // Construtor dita o que � obrigat�rio ao criar um novo objeto
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("O total de contas abertas � " + total);
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Estou criando uma conta " + agencia + "-" + numero);
    }
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
    
/* verificar o saldo em um programa externo */    
    public double getSaldo() { 
        return this.saldo;
    }

/* verificar o n�mero da conta em um programa externo */    
   
    public int getNumero() {
    	return this.numero;
    }
/* definir um novo n�mero de conta */
    public void setNumero(int numero) {
    	this.numero = numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if(agencia <= 0) {
    		System.out.println("N�o pode valor negativo");
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
    
    public static int getTotal() {   // m�todo da CLASSE
    	return Conta.total;
    }
}
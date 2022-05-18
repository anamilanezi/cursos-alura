public class TesteSacaNegativo { 
	
    public static void main(String[] args) {
    	
        Conta conta = new Conta();
        
        conta.deposita(100);
        System.out.println(conta.saca(200));  // n�o pode efetuar o saque
        System.out.println(conta.getSaldo());
        
        /* Com o saldo oculto, n�o � mais poss�vel acess�-lo dessa forma:
         * System.out.println(conta.saldo);	  // saldo = 100
         */

        /* Apesar de n�o ser permitido, seria poss�vel fazer o 
         * saque diretamente no atributo caso o saldo n�o fosse 
         * ocultado na defini��o da classe
         *          
         * conta.saldo = conta.saldo - 101;
         * System.out.println(conta.saldo); */
    }
}
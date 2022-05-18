public class TesteSacaNegativo { 
	
    public static void main(String[] args) {
    	
        Conta conta = new Conta();
        
        conta.deposita(100);
        System.out.println(conta.saca(200));  // não pode efetuar o saque
        System.out.println(conta.getSaldo());
        
        /* Com o saldo oculto, não é mais possível acessá-lo dessa forma:
         * System.out.println(conta.saldo);	  // saldo = 100
         */

        /* Apesar de não ser permitido, seria possível fazer o 
         * saque diretamente no atributo caso o saldo não fosse 
         * ocultado na definição da classe
         *          
         * conta.saldo = conta.saldo - 101;
         * System.out.println(conta.saldo); */
    }
}
// Gerente = classe filha, Gerente é um Funcionário (herda da classe Funcionario)
// Gerente também "assina o contrato"  Autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
	// super faz referência a métodos da classe mãe	
	public double getBonificacao() {
        System.out.println("Chamando o método bonificacao do GERENTE");
	    return super.getSalario();
	}

	private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
	
}

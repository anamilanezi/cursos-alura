// Gerente = classe filha, Gerente � um Funcion�rio (herda da classe Funcionario)
// Gerente tamb�m "assina o contrato"  Autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
	// super faz refer�ncia a m�todos da classe m�e	
	public double getBonificacao() {
        System.out.println("Chamando o m�todo bonificacao do GERENTE");
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

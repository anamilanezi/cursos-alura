
public class ControleBonificacao {

	private double soma;
	
	// Funcionario aceita qualquer classe que esteja na hierarquia/que herda do funcionario
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	  public double getSoma() {
          return soma;
      }
}

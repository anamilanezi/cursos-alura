// Classe m�e / base class / super class
// private (visivel apenas para classe m�e) > protected (visivel para m�es e filhos) > public
// N�o podemos instanciar essa classe, pq � abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// M�todo abstrato tamb�m n�o tem implementa��o, exige que sejam definidos nos filhos
	public abstract double getBonificacao();
		
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

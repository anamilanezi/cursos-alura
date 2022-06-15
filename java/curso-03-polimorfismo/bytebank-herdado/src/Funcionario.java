// Classe mãe / base class / super class
// private (visivel apenas para classe mãe) > protected (visivel para mães e filhos) > public
// Não podemos instanciar essa classe, pq é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// Método abstrato também não tem implementação, exige que sejam definidos nos filhos
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

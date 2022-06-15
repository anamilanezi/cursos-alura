// Funcionario passou a ser uma classe abstrata, então não é mais um objeto desse tipo
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("001122336-8");
		nico.setSalario(3600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	
	
	}

}

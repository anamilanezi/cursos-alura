
public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente ana = new Cliente();
		ana.nome = "Ana Milanezi";
		ana.cpf = "000.000.000-00";
		ana.profissao = "bióloga";
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(100);
		
		// Associa o cliente (Ana) à conta (contaDaAna)
		contaDaAna.titular = ana;
		System.out.println(contaDaAna.titular.nome);
		System.out.println(contaDaAna.titular);
		System.out.println(ana);
	}
}

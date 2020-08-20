
public class ProgramaInc {
	public static void main(String[] args) {
		Gerente ger1 = new Gerente("Gabriel", 3000, true, 20, 11, 2016);
		Supervisor sup1 = new Supervisor("Marcelo", 2500, true, 14, 9, 2018);
		Funcionario func1 = new Funcionario();
		
		ger1.solicitarAumento(0.25);
		sup1.solicitarAumento(0.30);
		ger1.bonificar();
		ger1.consultarCC();
		ger1.pedirFerias(13, 5, 2020);
		ger1.estaTrabalhando();
		ger1.pedirDemissao(20, 4, 2020);
		System.out.println("O ano de demissão de " + ger1.nome + " foi " + ger1.anoDem);
		ger1.estaTrabalhando();
		ger1.getSalarioBase();
		ger1.demitir(sup1);
		sup1.estaTrabalhando();
		sup1.demitir(ger1);
		sup1.consultarCC();
		ger1.reajustar(sup1, 3600);
		sup1.consultarCC();
	}
}
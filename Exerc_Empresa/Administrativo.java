
public class Administrativo extends PF {
	double bonificacao;
	double salarioBonus;
	public void bonificar() {
		salarioBonus=getSalarioBase() + (getSalarioBase()*bonificacao);
		System.out.println("Parabéns, " + nome + "! Esse mês você vai receber uma bonificação!");
	}
	public void consultarCC() {
		if (salarioBonus>0) {
		System.out.println(nome + ", seu salário esse mês é de " + salarioBonus);
		} else {
		System.out.println(nome + ", seu salário esse mês é de " + getSalarioBase());	
		}
		}
}

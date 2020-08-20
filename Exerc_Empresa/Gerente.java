
public class Gerente extends Administrativo {
	public Gerente(String nome, float salario, boolean trabalhando, int diaAd, int mesAd, int anoAd) {
		bonificacao = 0.12;
		this.nome=nome;
		super.setSalarioBase(salario);	
		this.trabalhando=trabalhando;
		this.diaAd = diaAd;
		this.mesAd = mesAd;
		this.anoAd = anoAd;
	}
	public void demitir (Funcionario func) {
		if (!(func instanceof Gerente)) {
			System.out.println (func.nome + ", você está demitido!");
			func.trabalhando = false;
		} else {
			System.out.println(nome + ", você não tem permissão para demitir esse funcionário!");
		}
	}
	public void reajustar (Funcionario func, double novoSal) {
		if (!(func instanceof Gerente)) {
			double sal = func.getSalarioBase();
			if (novoSal>sal) {
				func.setSalarioBase(novoSal);
				System.out.println(func.nome + ", seu salário foi reajustado para " + novoSal);
			}
		}
	}
}

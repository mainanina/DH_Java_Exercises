
public class Supervisor extends Administrativo {
	public Supervisor(String nome, double salario, boolean trabalhando, int diaAd, int mesAd, int anoAd) {
		bonificacao = 0.08;
		this.nome=nome;
		super.setSalarioBase(salario);
		this.trabalhando=trabalhando;
		this.diaAd = diaAd;
		this.mesAd = mesAd;
		this.anoAd = anoAd;
	}
	public void demitir (Funcionario func) {
		if (!(func instanceof Supervisor) && !(func instanceof Gerente)) {
			System.out.println (func.nome + ", você está demitido!");
			func.trabalhando = false;
		} else {
			System.out.println(nome + ", você não tem permissão para demitir esse funcionário!");
		}
	}	
}

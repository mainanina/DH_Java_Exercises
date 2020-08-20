import java.util.Random;

public class Funcionario{
	String nome;
	String endereco;
	String email;
	String setor;
	boolean trabalhando;
	private double salarioBase;
	int contraCheque;
	int diaAd;
	int mesAd;
	int anoAd;
	int diaDem;
	int mesDem;
	int anoDem;
	Random ger = new Random();

	
	public void solicitarAumento(double aum){
		int resp = ger.nextInt(2);
		if (resp==0) {
			salarioBase=salarioBase+salarioBase*aum;
			System.out.println(nome + ", seu aumento foi aprovado! Seu novo salário é " + salarioBase);
		} else {
			System.out.println(nome + ", infelizmente seu aumento foi reprovado");
		}
	}	
	public void consultarCC() {
		System.out.println(nome + ", seu salário esse mês é de " + salarioBase);
	}
	public void pedirFerias (int dia, int mes, int ano){
		if (((ano == anoAd) && ((mes-mesAd>=11))||(((ano*12)+mes)-((anoAd*12)+mesAd))>=11)){
			System.out.println(nome + ", suas férias foram aprovadas");
			trabalhando=false;
		}
	}
	public void pedirDemissao(int dia, int mes, int ano){
		trabalhando=false;
		System.out.println(nome + ", seu pedido de demissão foi aceito.");
		diaDem=dia;
		mesDem=mes;
		anoDem=ano;
	}
	public void estaTrabalhando() {
		if (trabalhando==false) {
			System.out.println("O funcionário " + nome + " não está trabalhando no momento.");
		} else {
			System.out.println("O funcionário " + nome + " está trabalhando no momento.");
		}
	}	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase=salarioBase;
	}
	
	
}


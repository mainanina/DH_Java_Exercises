import java.util.Scanner;
public abstract class Lanche {
	Scanner scan = new Scanner(System.in);
	private double preco;
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	private int tempoPreparo;
	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}
	public double calcularTempoEntrega (double distancia) {
		double tempoTotal = (distancia*10) + tempoPreparo;
		return tempoTotal;
	}
}

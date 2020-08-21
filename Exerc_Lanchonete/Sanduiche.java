import java.util.ArrayList;
import java.util.List;
public class Sanduiche extends Lanche {
	public List <String> ingredientes = new ArrayList<>();
	public Sanduiche() {
		super.setTempoPreparo(15);
		super.setPreco(18.50);
	}
	public void recheioSanduiche() {
		System.out.println("Escolha até 10 recheios para o seu sanduíche:");
		System.out.println("(digite o nome dos recheios desejados e digite 0 para fechar o pedido)");
		System.out.println(" ");
		String recheio="";
		int i;
		do {
			i=0;
			recheio = scan.next();
			ingredientes.add(recheio);
		} while ((!recheio.equals("0")) && i<10);
		System.out.println("--------------------------------------------------------");
		System.out.println("Ok, estamos preparando seu sanduiche!");
		System.out.println("--------------------------------------------------------");
	};
	public void revelarIngred () {
		for (String ingred : ingredientes) {
			System.out.println(ingred);
		}
	}
	@Override
	public String toString() {
		return "Sanduiche com recheio:";
	}
}

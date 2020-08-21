
public class Bolo extends Lanche{
	private String massa;
	private String recheio;
	private String cobertura;
	String divisao = "--------------------------------------------------------";
	public Bolo() {
		super.setTempoPreparo(10);
		super.setPreco(25.25);
	}
	public void saboresBolo() {
		System.out.println("Escolha o sabor da massa do bolo");
		System.out.println("[1] baunilha");
		System.out.println("[2] chocolate");
		System.out.println(divisao);
		int massaBolo = scan.nextInt();
		switch (massaBolo) {
			case 1:
				massa = "baunilha";
				break;
			case 2:
				massa = "chocolate";
				break;
			default:
				System.out.println("Você deve escolher a opção 1 ou 2");
		}
		System.out.println(divisao);
		System.out.println("Escolha o sabor do recheio do bolo");
		System.out.println("[1] coco");
		System.out.println("[2] brigadeiro");
		System.out.println(divisao);
		int recBolo = scan.nextInt();
		switch (recBolo) {
			case 1:
				recheio = "coco";
				break;
			case 2:
				recheio = "brigadeiro";
				break;
			default:
				System.out.println("Você deve escolher a opção 1 ou 2");
		}
		System.out.println(divisao);
		System.out.println("Escolha o sabor da cobertura do bolo");
		System.out.println("[1] buttercream");
		System.out.println("[2] chantily");
		System.out.println(divisao);
		int cobBolo = scan.nextInt();
		switch (cobBolo) {
			case 1:
				cobertura = "buttercream";
				break;
			case 2:
				cobertura = "chantily";
				break;
			default:
				System.out.println("Você deve escolher a opção 1 ou 2");
		}
		System.out.println(divisao);
		System.out.println("O seu bolo de " + massa + " com recheio de " + recheio + " e cobertura de " + cobertura + " está sendo preparado.");
		System.out.println(divisao);
	}
	@Override
	public String toString() {
		return "Bolo de " + massa + " com recheio de " + recheio + " e cobertura de " + cobertura;
	}

}

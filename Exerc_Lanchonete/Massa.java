public class Massa extends Lanche {
	private String molho;
	private int tipoMassa;
	private String tm;
	public String molhoEscrito = "";
	public Massa(int tipoMassa) {
		super.setTempoPreparo(30);
		super.setPreco(30.90);
		this.tipoMassa = tipoMassa;
		if (tipoMassa==1) {
			tm = "macarrão";
		} else if (tipoMassa==2) {
			tm = "pizza";
		} else {
			tm = "lasanha";
		}
	}
	public void saborMassas() {
		if (tm.equals("macarrão")){
			System.out.println("Escolha o sabor do molho do macarrão");
		} else {
			System.out.println("Escolha o sabor do molho da " + tm);
		}
		System.out.println("[1] bolonhesa");
		System.out.println("[2] bechamel");
		System.out.println("[3] sugo");
		System.out.println("--------------------------------------------------------");
		int molho = scan.nextInt();
		switch (molho) {
			case 1:
				molhoEscrito = "bolonhesa";
				break;
			case 2:
				molhoEscrito = "bechamel";
				break;
			case 3:
				molhoEscrito = "sugo";
				break;
			default:
				System.out.println("Você deve escolher a opção 1, 2 ou 3");
		}	
		System.out.println("--------------------------------------------------------");
		if (tm.equals("macarrão")){
			System.out.println("Seu macarrão com molho " + molhoEscrito + " está sendo preparado!");
		} else {
			System.out.println("Sua " + tm + " com molho " + molhoEscrito + " está sendo preparada!");
		}
		System.out.println("--------------------------------------------------------");
	}
	@Override
	public String toString() {
		return tm + " com molho " + molhoEscrito;
	}
}

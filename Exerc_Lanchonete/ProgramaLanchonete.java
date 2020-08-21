import java.util.Scanner;

public class ProgramaLanchonete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double tempoT=0;
		double precoFinal=0;
		Object itemEscolhido="";
		String divisao = "--------------------------------------------------------";
		System.out.println("Sistema de Delivery desenvolvido por Maína Alexandre");
		System.out.println(divisao);
		System.out.println("Bem-vindo à nossa Lanchonete!");
		System.out.println("Faça seu pedido digitando o número da sua opção:");
		System.out.println(divisao);
		opcoesMenu();
		int escolha = scan.nextInt();
		while (escolha<1 || escolha>3) {		
			System.out.println("Escolha a opção 1, 2 ou 3");
			opcoesMenu();
			escolha = scan.nextInt();
		};
		switch (escolha) {
		case 1:
			System.out.println(divisao);
			System.out.println(divisao);
			Sanduiche sand1 = new Sanduiche();
			sand1.recheioSanduiche();
			itemEscolhido=sand1;
			break;
		case 2:
			System.out.println(divisao);
			System.out.println("Escolha o tipo de massa:");
			System.out.println("[1] Macarrão");
			System.out.println("[2] Pizza");
			System.out.println("[3] Lasanha");
			System.out.println(divisao);
			int escolha2 = scan.nextInt();
			System.out.println(divisao);
			if (escolha2>0 && escolha2<4) { 
				Massa massa1 = new Massa(escolha2);
				itemEscolhido=massa1;
				massa1.saborMassas();
			} else {
				System.out.println("Você deve escolher um número entre 1 e 3");
				escolha2 = scan.nextInt();
			}
			break;
		case 3:
			System.out.println(divisao);
			Bolo bolo1 = new Bolo();
			bolo1.saboresBolo();
			itemEscolhido=bolo1;
			break;
		default:
			System.out.println("Escolha a opção 1, 2 ou 3");
		}
		System.out.println("Qual a sua distância do restaurante em km?");
		double d = scan.nextDouble();
		System.out.println(divisao);
		tempoT = ((Lanche) itemEscolhido).calcularTempoEntrega(d);
		precoFinal = ((Lanche) itemEscolhido).getPreco();
		int tempoTotalHoras = (int) (tempoT/60);
		int tempoTotalMin = (int) (tempoT-(tempoTotalHoras*60));
		System.out.println("RESUMO DO PEDIDO");
		System.out.println(" ");
		System.out.println(itemEscolhido);
		switch (escolha) {
			case 1:
				((Sanduiche) itemEscolhido).revelarIngred();
				break;
			case 2:
				
			default:
		}
		System.out.println(" ");
		System.out.println("Preço: R$ " + precoFinal);
		correcaoTempo(tempoTotalHoras, tempoTotalMin);
		System.out.println(divisao);
		System.out.println("Obrigado por comprar conosco!");
		System.out.println("Siga nossa lanchonete no instagram @melhordeliverydacidade");
	}	
	public static void opcoesMenu() {
		System.out.println("[1] Sanduíches");
		System.out.println("[2] Massas");
		System.out.println("[3] Bolos");
		System.out.println("--------------------------------------------------------");
	}
	public static void correcaoTempo(int tempoTotalHoras, int tempoTotalMin) {
		if (tempoTotalHoras>0) { 
		System.out.println("Tempo de entrega: " + tempoTotalHoras + " horas e " + tempoTotalMin + " minutos ");
		} else {
		System.out.println("Tempo de entrega: " + tempoTotalMin + " minutos ");
		}
	}
}

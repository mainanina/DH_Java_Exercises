package package1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
	//Faça um programa que carregue um array com oito números inteiros e mostre dois arrays resultantes. O primeiro array resultante deve conter os números positivos. O segundo array resultante deve conter os números negativos. Cada array resultante vai ter no máximo oito posições, sendo que nem todas devem obrigatoriamente serem utilizadas. Ordene esse array	
		
		int[] numeros = {-15, 6, 94, -7, 534, -9, 15, 25};
		int [] positivos = new int[8]; //tem maneira de dizer "no max 8???"
		int [] negativos = new int[8];
		int i;
		int z=0;
		int n=0;
		for (i=0; i<8; i++) {
			if (numeros[i]>=0) {
				positivos[z]=numeros[i];
				z=z+1;
			} else {
				negativos[n]=numeros[i];
				n=n+1;
			}
		}
		System.out.println("Dada lista de números: ");
		System.out.println (Arrays.toString(numeros));
		System.out.println("Os positivos são: ");
		System.out.println (Arrays.toString(positivos));
		System.out.println("Os negativos são: ");
		System.out.println (Arrays.toString(negativos));
		
		for (i=0; i<7; i++) {
			for (n=i+1; n<8; n++) {
				if (numeros[n]<numeros[i]) {
					z=numeros[n];
					numeros[n]=numeros[i];
					numeros[i]=z;
				}
			}
		}
		System.out.println("Ordenando a lista de numeros, temos: ");
		System.out.println (Arrays.toString(numeros));

		
		//Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em um array. Mostre a maior e a menor temperatura do ano e em que mês elas ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 – fevereiro, ...).
		int[][] tempMes = {{32, 25}, {30, 24}, {29, 23}, {28, 22}, {25, 19}, {23, 14}, {24, 8}, {22, 5}, {27, 18}, {27, 20}, {31, 21}, {32, 26}};
		int tmax=0;
		int mmax=0;
		int tmin=0;
		int mmin=0;
		String mesmax;
		String mesmin;
		for (i=0; i<11; i++) {
			for (n=i+1; n<12; n++) {
				if (tempMes[n][0] > tempMes[i][0]) {
					tmax=tempMes[n][0];
					mmax=n;
				}
				if (tempMes[n][1]< tempMes[i][1]) {
					tmin=tempMes[n][1];
					mmin=n;
				}
			}
		
		}
		switch (mmax) {
		case 0:
			mesmax="janeiro";
			break;
		case 1:
			mesmax="fevereiro";
			break;
		case 2:
			mesmax="março";
			break;
		case 3:
			mesmax="abril";
			break;
		case 4:
			mesmax="maio";
			break;
		case 5:
			mesmax="junho";
			break;
		case 6:
			mesmax="julho";
			break;
		case 7:
			mesmax="agosto";
			break;
		case 8:
			mesmax="setembro";
			break;
		case 9:
			mesmax="outubro";
			break;
		case 10:
			mesmax="novembro";
			break;
		default:
			mesmax="dezembro";
		}
		
		switch (mmin) {
		case 0:
			mesmin="janeiro";
			break;
		case 1:
			mesmin="fevereiro";
			break;
		case 2:
			mesmin="março";
			break;
		case 3:
			mesmin="abril";
			break;
		case 4:
			mesmin="maio";
			break;
		case 5:
			mesmin="junho";
			break;
		case 6:
			mesmin="julho";
			break;
		case 7:
			mesmin="agosto";
			break;
		case 8:
			mesmin="setembro";
			break;
		case 9:
			mesmin="outubro";
			break;
		case 10:
			mesmin="novembro";
			break;
		default:
			mesmin="dezembro";
		}
			
		System.out.println("A maior temperatura do ano foi " + tmax + " no mês de " + mesmax);
		System.out.println("A menor temperatura do ano foi " + tmin + " no mês de " + mesmin);
		
		// Faça um programa que receba o número sorteado em um dado durante 20 jogadas, mostre os números sorteados e a frequência com que aparecem.	
		
		
		Random ger = new Random();
		int sort=0;
		int [] Sorteados = new int[20];
			for (int x=0; x<20; x++) {
				sort=ger.nextInt(6);
				Sorteados[x]=sort+1;
			}
		System.out.println("Os números sorteados no dado foram:");
		System.out.println (Arrays.toString(Sorteados));
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		int n5=0;
		int n6=0;
		for (int l=0; l<20; l++) {
			if (Sorteados[l]==1) {
				n1=n1+1;
			} else if (Sorteados[l]==2) {
				n2=n2+1;
			} else if (Sorteados[l]==3) {
				n3=n3+1;
			} else if (Sorteados[l]==4) {
				n4=n4+1;
			} else if (Sorteados[l]==5) {
				n5=n5+1;
			} else {
				n6=n6+1;
			}
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o número do dado que você deseja saber a frequência?");
		int pergunta = scan.nextInt();
		switch (pergunta) {
		case 1:
			System.out.println("O valor 1 saiu " + n1 + " vezes no dado");
			break;
		case 2:
			System.out.println("O valor 2 saiu " + n2 + " vezes no dado");
			break;
		case 3:
			System.out.println("O valor 3 saiu " + n3 + " vezes no dado");
			break;
		case 4:
			System.out.println("O valor 4 saiu " + n4 + " vezes no dado");
			break;
		case 5:
			System.out.println("O valor 5 saiu " + n5 + " vezes no dado");
			break;
		case 6:
			System.out.println("O valor 6 saiu " + n6 + " vezes no dado");
			break;
		default:
			System.out.println("Os valores do dado vão de 1 a 6");
		}
		
		// Faça um programa que leia um código numérico inteiro e um array de cinco posições de números reais. Se o código for zero, termine o programa. Se o código for 1, mostre o array na ordem direta. Se o código for dois mostre o array na ordem inversa.
		System.out.println("Digite um número entre 0 e 2");
		int cod = scan.nextInt();
		int[] seq = {20, 11, 19, 81, 38};
		switch (cod) {
		case 0:
			System.out.println("Fim do programa");
			break;
		case 1: 
			System.out.println("A sequencia numerica é: ");
			System.out.println (Arrays.toString(seq));
			break;
		case 2: 
			int [] seqCont = new int[5];
			for (int y=0; y<5; y++) {
				seqCont[y]=seq[4-y];
			};			
			System.out.println (Arrays.toString(seqCont));
			break;
		default:
			System.out.println("Erro: o número escolhido deve ser 0, 1 ou 2");
		};
	}
}


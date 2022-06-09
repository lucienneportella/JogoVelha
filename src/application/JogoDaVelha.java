package application;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			char[][] tabuleiro = new char[3][3];

			int c = 2;
			int linha = 0;
			int coluna = 0;

			boolean jogada = false;
			while (!jogada) {
				if (c % 2 == 0) {
					System.out.println("Jogador 1: ");
					System.out.println("Linha: ");
					linha = sc.nextInt();
					System.out.println("Coluna: ");
					coluna = sc.nextInt();
				} else {
					System.out.println("Jogador 2: ");
					System.out.println("Linha: ");
					linha = sc.nextInt();
					System.out.println("Coluna: ");
					coluna = sc.nextInt();
				}
				boolean jogadaValida1 = false;
				while (!jogadaValida1) {
					if (linha > 2 || coluna > 2) {
						System.out.println("Digite um valor válido (0-2)");
						System.out.println("Linha: ");
						linha = sc.nextInt();
						System.out.println("Coluna: ");
						coluna = sc.nextInt();
						jogadaValida1 = false;

					}
					if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
						System.out.println("Posição já preenchida... entre com uma posiçãop válida.");
						System.out.println("Linha: ");
						linha = sc.nextInt();
						System.out.println("Coluna: ");
						coluna = sc.nextInt();
						jogadaValida1 = false;

					}

					else {
						jogadaValida1 = true;
					}
				}
				for (int i = 0; i < tabuleiro.length; i++) {
					for (int j = 0; j < tabuleiro.length; j++) {
						if (c % 2 == 0) {
							tabuleiro[linha][coluna] = 'X';

						} else {
							tabuleiro[linha][coluna] = 'O';

						}

						System.out.print(tabuleiro[i][j] + "|");
					}
					System.out.println();
				}

				if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X')
						|| (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X')
						|| (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X')
						|| (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X')
						|| (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X')
						|| (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')
						|| (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')
						|| (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')) {
					System.out.println("PARABÉNS! Jogador 1 venceu");
					jogada = true;

				} else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O')
						|| (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O')
						|| (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O')
						|| (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O')
						|| (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O')
						|| (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')
						|| (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')
						|| (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {
					System.out.println("PARABÉNS! Jogador 2 venceu!");
					jogada = true;
				} else if (c > 9) {
					jogada = true;
					System.out.println("DEU VELHA! Ninguém ganhou essa partida. :((");
				}
				c++;
			}
			sc.close();
	}

}

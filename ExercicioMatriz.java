package exercicios1206;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m[][] = new int [4][4];

		for (int i=0; i<4;i++) {
			for (int j=0; j<4;j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
				System.out.println("[" + m[i][j]+ "]");
			}
			System.out.print("\n---------------");
		}
		ler.close();
	}

}



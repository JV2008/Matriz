package exercicios1206;

import java.util.Scanner;

public class MatrizAeB {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];
	
		for (int i=0; i<3;i++) {
			for (int j=0; j<3;j++) {
				a[i][j] = (int)Math.round(Math.random()*100);
				b[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		System.out.println("Matriz A");
		for (int i=0; i<3;i++) {
			for (int j=0; j<3;j++) {
				System.out.print("[" +a[i][j]+ "]");
			}
				System.out.println("\n------------------");
			
		}
		System.out.println("Matriz B");
		for (int i=0; i<3;i++) {
			for (int j=0; j<3;j++) {
				System.out.print("[" +b[i][j]+ "]");
			}
				System.out.println("\n------------------");
			
		}
		System.out.println("Matriz C");
		for (int i=0; i<3;i++) {
			for (int j=0; j<3;j++) {
		c[i][j] += a[i][j]*b[i][j];
		
		
		System.out.print("[" +c[i][j]+ "]");
			}
		System.out.println("\n------------------");
		}
		
		
		ler.close();
	}
}
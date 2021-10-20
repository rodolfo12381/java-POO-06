package application;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int [][] matriz = new int [M][N];
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
					
				matriz[i][j] = sc.nextInt();
			}
		}
		int numAux = sc.nextInt();
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
					
				if (matriz[i][j] == numAux) {
					System.out.println("Position "+i+","+j+":");
					if ( j != 0 ) {
						System.out.println("Left: "+matriz[i][j-1]);
					}
					if (j != (N-1)) {
						System.out.println("Right: "+matriz[i][j+1]);
					}
					if ( i != 0) {
						System.out.println("Up: "+matriz[i-1][j]);
					}
					if ( i != (M-1)) {
						System.out.println("Down: "+matriz[i+1][j]);
					}			
				}
			}
		}
	}
}

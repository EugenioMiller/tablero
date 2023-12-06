
/**
 * 
 * Write a function that accepts an array of 10 integers (between 0 and 9), 
 * that returns a string of those numbers in the form of a phone number.
 *
 */

public class Trainer {
	
	static final int MAX=8;

	public static void main(String[] args) {
		
		char [][] tablero = new char [MAX][MAX];
		
		pintarCeldas(tablero);
		
		for ( int i = 0; i < MAX; i++ ) {
			imprimirTablero(tablero[i]);
			System.out.println("");
		}
		
	}

	private static void imprimirTablero(char[] tablero) {
		for ( int j = 0; j < MAX; j++ ) {
			System.out.print(tablero[j]);
		}
	}

	private static void pintarCeldas(char[][] tablero) {
		for( int i = 0; i < MAX; i++ ) {
			for( int j = 0; j < MAX; j++) {
				if( (i + j) % 2 == 0 ) {
					tablero[i][j] = 'R';
				}
				else {
					tablero[i][j] = 'A';
				}
			}
		}
		
	}

	
}

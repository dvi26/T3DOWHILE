package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int numeror;
		String respuesta;
		numeror=(int)(Math.random()*100+1);
		System.out.println("¿Es?:" + numeror );
		Scanner sc = new Scanner(System.in);
		respuesta=sc.nextLine();
		do {
			if ("mayor" .equals(respuesta)) {
			numeror=(int)(Math.random()*(101-numeror)+numeror);
			System.out.println("¿Es?:" + numeror );
			respuesta=sc.nextLine();
			}
			else if ("menor" .equals(respuesta)) {
			numeror=(int)(Math.random()*numeror+1);
			System.out.println("¿Es?:" + numeror );
			respuesta=sc.nextLine();
			}
			else if ("igual" .equals(respuesta)) {
				System.out.println("Has ganado" );
			}
			}while ("mayor" .equals(respuesta) || ("menor" .equals(respuesta)));
		
		
		
			sc.close();
		}
		
	}



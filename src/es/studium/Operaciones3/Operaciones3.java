package es.studium.Operaciones3;

import java.util.Scanner;

public class Operaciones3 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indicar el primer n�mero:");
		num1 = teclado.nextInt();
		System.out.println("Indicar el segundo n�mero:");
		num2 = teclado.nextInt();
		System.out.println("Indicar el tercer n�mero:");
		num3 = teclado.nextInt();
		System.out.println("La suma de los tres n�meros es:" + suma(num1, num2, num3));
		System.out.println("El producto de los tres n�meros es:" + producto(num1, num2, num3));
		System.out.println("La media de los tres n�meros es:" + media(num1, num2, num3));
		teclado.close();
	}

	public static int suma(int a, int b, int c) {
		int suma;
		suma = a + b + c;
		return (suma);
	}

	public static int producto(int a, int b, int c) {
		int producto;
		producto = a * b * c;
		return (producto);
	}

	public static float media(int a, int b, int c) {
		float media;
		media = (float) suma(a, b, c) / 3;
		return (media);
	}
}

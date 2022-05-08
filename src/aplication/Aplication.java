package aplication;

import java.util.Scanner;

import entidades.Triangulo;

public class Aplication {

	public static void main(String[] args) {

		// Criar um programa para ler as medidas de 2 triangulos x , y e calcular a area
		// deles.
		// em seguida , mostrar o valor das areas e dizer qual triangulo possui a area
		// maior.
		// formula para calcular é : area = Raiz quadrada de p*(p-a)*(p-b)*(p-c) sendo
		// que p = a+b+c/2
		// resolução sem Orientaçao a Objetos.
		Scanner sc = new Scanner(System.in);

		System.out.println("entre com os dados do triangulo X: ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		Triangulo x = new Triangulo(xa, xb, xc);

		System.out.println("entre com os dados do triangulo X: ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		Triangulo y = new Triangulo(ya, yb, yc);

		System.out.printf("area x: %.4f\n", x.Area());
		System.out.printf("area y: %.4f\n", y.Area());

		if (x.Area() > x.Area()) {
			System.out.println("area X maior!");
		} else {
			System.out.println("area y maior!");
		}
		sc.close();

	}

}

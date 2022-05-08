package aplication;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
	 // Criar um programa para ler as medidas de 2 triangulos x , y e calcular a area deles.
		// em seguida , mostrar o valor das areas e dizer qual triangulo possui a area maior.
		// formula para calcular é : area = Raiz quadrada de p*(p-a)*(p-b)*(p-c) sendo que p = a+b+c/2
		//resolução sem Orientaçao a Objetos.
		Scanner sc = new Scanner(System.in);
		double xa,xb,xc,ya,yb,yc;
		double p, areaX,areaY;
		
		System.out.println("entre com os dados do triangulo X: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		p = (xa+xb+xc)/2;
		areaX= Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));
		
		System.out.println("entre com os dados do triangulo X: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		p = (ya+yb+yc)/2;		
		areaY = Math.sqrt(p*(p-ya)*(p-yb)*(p-yc));
		
		
		System.out.printf("area x: %.4f\n", areaX );
		System.out.printf("area y: %.4f\n", areaY);
		if(areaX > areaY) {
			System.out.println("area X maior!");
		}else {
			System.out.println("area y maior!");
		}
		
		
		
		
		
		
		
	}

}

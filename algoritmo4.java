package view;

import java.util.Scanner;

public class algoritmo4 
{

	public static void main(String[] args) 
	{
		
	Scanner ler = new Scanner(System.in);
	
	double X, Y;
	
	System.out.println("Seja bem vindo");
	
	System.out.println("Escolha um n�mero: ");
	X = ler.nextDouble();
	
	System.out.println("Escolha outro n�mero: ");
	Y = ler.nextDouble();
	
	if(X > Y) 
	{
	System.out.println("O n�mero " + X + " � maior que o n�mero " + Y);	
	}
	
	else 
	{
	System.out.println("O n�mero " + Y + " � maior que o n�mero " + X);	
	}
	
	
	}

}

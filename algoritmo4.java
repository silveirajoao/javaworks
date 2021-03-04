package view;

import java.util.Scanner;

public class algoritmo4 
{

	public static void main(String[] args) 
	{
		
	Scanner ler = new Scanner(System.in);
	
	double X, Y;
	
	System.out.println("Seja bem vindo");
	
	System.out.println("Escolha um número: ");
	X = ler.nextDouble();
	
	System.out.println("Escolha outro número: ");
	Y = ler.nextDouble();
	
	if(X > Y) 
	{
	System.out.println("O número " + X + " é maior que o número " + Y);	
	}
	
	else 
	{
	System.out.println("O número " + Y + " é maior que o número " + X);	
	}
	
	
	}

}

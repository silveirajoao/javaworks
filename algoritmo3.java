package view;

import java.util.Scanner;

public class algoritmo3 
{

	public static void main(String[] args) 
	{
		
	Scanner ler = new Scanner(System.in);
	
	double x;
	
	System.out.println("Seja bem vindo");
	
	System.out.println("Escolha um n�mero e eu te direi se ele � par ou �mpar: ");
	x = ler.nextDouble();
	
	if(x % 2 == 0) 
	{
	System.out.println("Seu n�mero � par.");	
	}
	
	else 
	{
	System.out.println("Seu n�mero � �mpar.");
	}
	
	
	}
	
}	

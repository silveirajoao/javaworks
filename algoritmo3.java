package view;

import java.util.Scanner;

public class algoritmo3 
{

	public static void main(String[] args) 
	{
		
	Scanner ler = new Scanner(System.in);
	
	double x;
	
	System.out.println("Seja bem vindo");
	
	System.out.println("Escolha um número e eu te direi se ele é par ou ímpar: ");
	x = ler.nextDouble();
	
	if(x % 2 == 0) 
	{
	System.out.println("Seu número é par.");	
	}
	
	else 
	{
	System.out.println("Seu número é ímpar.");
	}
	
	
	}
	
}	

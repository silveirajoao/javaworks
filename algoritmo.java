package view;

import java.util.Scanner;

public class algoritmo 
{

	public static void main(String[] args) 
	{
		
	Scanner ler = new Scanner (System.in);
		
	double numero;
		
	System.out.println("Pense em um n�mero e o digite aqui: ");
	numero = ler.nextDouble();
		
	if(numero >= 0)	
	{
	System.out.println("O n�mero que voc� pensou � real positivo");
	}

	else 
	{
	System.out.println("O n�mero que voc� pensou � real negativo");
	}

	
	}

}	
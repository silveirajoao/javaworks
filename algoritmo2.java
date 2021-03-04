package view;

import java.util.Scanner;

public class algoritmo2 
{

	public static void main(String[] args) 
	{
		
	Scanner ler = new Scanner(System.in);
	
	double X, Y;
	
	System.out.println("Olá companheiro, pense em dois valores diferentes ou iguais");
	
	System.out.println("Digite aqui o primeiro valor: ");
	X = ler.nextDouble();
	
	System.out.println("Digite aqui o segundo valor: ");
	Y = ler.nextDouble();
	
	if(X == Y) 
	{
	System.out.println("Você pensou no mesmo valor duas vezes.");	
	}

	else
	{
	System.out.println("Você pensou em dois valores diferentes.");
	}
	
	
	}

}

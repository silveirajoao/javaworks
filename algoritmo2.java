package view;

import java.util.Scanner;

public class algoritmo2 
{

	public static void main(String[] args) 
	{
		
	Scanner ler = new Scanner(System.in);
	
	double X, Y;
	
	System.out.println("Ol� companheiro, pense em dois valores diferentes ou iguais");
	
	System.out.println("Digite aqui o primeiro valor: ");
	X = ler.nextDouble();
	
	System.out.println("Digite aqui o segundo valor: ");
	Y = ler.nextDouble();
	
	if(X == Y) 
	{
	System.out.println("Voc� pensou no mesmo valor duas vezes.");	
	}

	else
	{
	System.out.println("Voc� pensou em dois valores diferentes.");
	}
	
	
	}

}

package view;

import java.util.Locale;

import java.util.Scanner;

public class variavel 
{
	
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		String nomeLogin;
		double variavelA;
		
		System.out.println(" Fa�a seu login ");
		
		System.out.println(" Coloque seu Usu�rio: ");
		nomeLogin = ler.nextLine();
		
		System.out.println(" Esoolha um n�mero para a vari�vel A: ");
		variavelA = ler.nextDouble();
		
		double xA = (variavelA)*2, xxA = (xA)*3, xxxA = (xxA)/2, xxxxA = (variavelA)*(variavelA), xxxxxA = (xA)/5;
		
		System.out.println("=====================");
		System.out.println("O dobro de A �: " + xA);
		System.out.println("O triplo do dobro de A �: " + xxA);
		System.out.println("A metade do triplo do dobro de A �: " + xxxA);
		System.out.println("O quadrado de A �:" + xxxxA);
		System.out.println("A quinta parte do dobro de A �: " + xxxxxA);
		System.out.println("=====================");
	}

}

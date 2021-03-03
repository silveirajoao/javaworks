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
		
		System.out.println(" Faça seu login ");
		
		System.out.println(" Coloque seu Usuário: ");
		nomeLogin = ler.nextLine();
		
		System.out.println(" Esoolha um número para a variável A: ");
		variavelA = ler.nextDouble();
		
		double xA = (variavelA)*2, xxA = (xA)*3, xxxA = (xxA)/2, xxxxA = (variavelA)*(variavelA), xxxxxA = (xA)/5;
		
		System.out.println("=====================");
		System.out.println("O dobro de A é: " + xA);
		System.out.println("O triplo do dobro de A é: " + xxA);
		System.out.println("A metade do triplo do dobro de A é: " + xxxA);
		System.out.println("O quadrado de A é:" + xxxxA);
		System.out.println("A quinta parte do dobro de A é: " + xxxxxA);
		System.out.println("=====================");
	}

}

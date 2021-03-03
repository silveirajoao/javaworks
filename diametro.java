package view;

import java.util.Scanner;

import java.util.Locale;
import java.util.Scanner;

public class diametro 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		String nomeUsuario;
		double raio;
		
		System.out.println(" Bem vindo Usuário ");
		
		System.out.println(" Digite seu Usuário: ");
		nomeUsuario = ler.nextLine();
		
		System.out.println(" Digite o Raio de uma circunferência: ");
		raio = ler.nextDouble();
		
		double nDiametro = (raio)*2, area = (raio)*(raio), quadrante = (area)/4; 
		
		System.out.println("=====================");
		System.out.println(" O diâmetro da circunferência é: " + nDiametro);
		System.out.println(" Um quadrante da circunferência é igual a: " + quadrante + "π");
		System.out.println("=====================");	
	}
}

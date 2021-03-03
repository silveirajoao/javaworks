package view;

import java.util.Scanner;

import java.util.Locale;

public class aluno 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		String nomeAluno;
		double nota1, nota2, nota3;
		
		System.out.println (" Bem vindo Aluno ");
		
		System.out.println (" Digite Seu Nome: ");
		nomeAluno = ler.nextLine();
		
		System.out.println (" Coloque sua primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println(" Coloque sua segunda nota: ");
		nota2 = ler.nextDouble ();
		
		System.out.println(" Coloque sua terceira nota: ");
		nota3 = ler.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("=====================");
		System.out.println(nomeAluno + ", sua média é: " + media);
		System.out.println("=====================");
	}

}

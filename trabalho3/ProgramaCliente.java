package view;

import java.util.Scanner;

public class ProgramaCliente 
{
    
    public static void main (String[] args)
    {
        
        Scanner ler = new Scanner(System.in);
        
        Cliente c1 = new Cliente();
        
        System.out.println("Bem vindo");
        
        System.out.println("Digite seu nome: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite sua idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite a sua renda");
        c1.setRenda(ler.nextDouble());        
      
        System.out.println("==============================");
        
        System.out.println(c1.getNome() + "," + c1.classificarIdade() + c1.classificarRenda());
        
        System.out.println("==============================");
    }        
  
}

package Trabalho4;

import java.util.Scanner;

public class Main 
{

    
    public static void main(String[] args) 
    {
        
        Scanner ler = new Scanner(System.in);
        
        Livro b1 = new Livro();
        Cliente c1 = new Cliente();
       
        System.out.println("Bem vindo, vamos realizar seu cadastro.");
        
        System.out.println("Digite seu nome: ");
        c1.nome = ler.nextLine();
        
        System.out.println("Digite a sua idade: ");
        c1.idade = ler.nextByte();
        
        System.out.println("Digite sua renda mensal");
        c1.setRenda(ler.nextDouble());
        
        System.out.println("Cadastro feito!");
        
        System.out.println("********************************************");
        
        System.out.println("Nome: " + c1.nome);
        
        System.out.println("Idade: " + c1.idade);
        
        System.out.println("Renda: " + c1.getRenda());
        
        System.out.println(c1.verificarRenda());
        
        System.out.println("********************************************");
        
        System.out.println("Vamos agora escolher um livro.");
        
        System.out.println("Digite o título do livro: ");
        ler.nextLine();
        b1.titulo = ler.nextLine();
        
        System.out.println("Digite o genêro: ");
        b1.genero = ler.nextLine();
        
        System.out.println("Digite o preço: ");
        b1.setPreco(ler.nextDouble());
       
        System.out.println("Escolha feita!");
        
        System.out.println("********************************************");
        
        System.out.println("Título: " + b1.titulo);
        
        System.out.println("Genêro: " + b1.genero);
        
        System.out.println("Preço: " + b1.getPreco());
        
        System.out.println(b1.verificarCompra());
        
        System.out.println("********************************************");
    }
    
}

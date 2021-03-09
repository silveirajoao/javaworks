package View;

import java.util.Scanner;

public class ProgramaLivro 
{

    
    public static void main(String[] args)
    {
        
        Scanner ler = new Scanner(System.in);
        
        Livro b1 = new Livro();
        
        System.out.println("Bem vindo leito, vamos comprar um livro?");
        
        System.out.println("Digite o título do livro que você deseja: ");
        b1.titulo = ler.nextLine();
        
        System.out.println("Digite o autor do livro que você deseja: ");
        b1.autor = ler.nextLine();
        
        System.out.println("Digite o gênero do livro que você deseja: ");
        b1.setGenero(ler.nextLine());
        
        System.out.println("Digite o ano que o livro foi públicado: ");
        b1.setAno(ler.nextInt());
        
        System.out.println("Digite quanto custa o livro: ");
        b1.setPreco(ler.nextDouble());
        
        System.out.println("====================================================");
        
        System.out.println("Título do livro: " + b1.titulo);
        
        System.out.println("Autor do livro: " + b1.autor);
        
        System.out.println("Gênero do livro: " + b1.getGenero());
        
        System.out.println("Ano de publicação do livro: " + b1.getAno());
        
        System.out.println("O preço do livro é: " + b1.getPreco());
        
        System.out.println(b1.verificarDesconto());
        
    }        
    
}

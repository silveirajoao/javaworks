/*
1 - Faça um programa para ler um vetor com valor indeterminado. 
Após isto, ler mais um número qualquer, calcular (soma) e 
escrever quantas vezes esse número aparece no vetor. 
Sempre imprimir na tela os processos do vetor.
*/
package trabalho6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 
{

    public static void main(String[] args) 
    {
        
        Scanner ler = new Scanner(System.in);
        
        int X = 0;
        
        ArrayList<Integer> lista = new ArrayList();
        
        System.out.println("Digite alguns números aleátorios.");
        System.out.println("OBS: quando quiser parar digite '0'.");
        
        System.out.println(" ");
        
         /* 1ª PARTE       
        - Digitar o número;
        - Gravar o número;
        - Adicionar o número.
        ENQUANTO o número for diferente de 0. 
        */       
        do
        {
            System.out.println("Digite um número: ");
            X = ler.nextInt();
            lista.add(X);
        }
        
        while (X != 0);
        
        /* 2ª PARTE
        Adicionando mais um número digitado.
        */
        
        System.out.println("Lista dos números: " + lista);
        
        System.out.println(" ");
        
        
        System.out.println("Digite mais um número qualquer: ");
        X = ler.nextInt();
        lista.add(X);
        
        System.out.println("A lista dos números agora é: " + lista);
        
        /* 2ª PARTE
        Somar os números do ArrayList
        */
        
        int soma = 0;
        
        for(int numero : lista)
        {
            soma = soma + numero;
        }
        
       System.out.println("Soma dos números digitado: " + soma);
       
       
       /* 3ª PARTE
        escrever quantas vezes o número "A" aparece no Array.
        */
       int A = 0;
       
       while(A != 0);
      
        System.out.println("Escolha um dos números da lista: ");
        A = ler.nextInt();
        
        int cont = 0;
        
        for(int i : lista)
        {
            if (i == A)
            {
                cont++;
            }
        }
        
        System.out.println("O número " + A + " apareceu " + cont + " vez(es).");
        
    }
    
}

/*
 Leia um vetor de 20 posições. Contar e escrever 
quantos valores pares e ímpares ele possui.
Imprimir na tela
*/
package trabalho6;

import java.util.Arrays;

public class Exercicio2 
{

    public static void main(String[] args) 
    {
        /* 
        1ª PARTE
        - Criando um vetor com 20 posições
        - Determinando números pares
        - Determinando números ímpares
        */
        int[] numeros = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        
        int[] pares = {0,2,4,6,8,10,12,14,16,18};
        
        int[] impares ={1,3,5,7,9,11,13,15,17,19};
        
        System.out.println("Vetores do Array: ");
        
        for(int i = 0; i < 20; i++)
        {
            System.out.println(numeros[i]);
        }
        
        //usando método toString para exibir os valores pares e ímpares do Array  
        
        System.out.println("Vetores pares do Array: " + Arrays.toString(pares));
        
        System.out.println("Vetores ímpares do Array: " + Arrays.toString(impares));
        
        //Usando o length para saber quantos valores pares e ímpareso tem no Array        
        System.out.println("O Array pares contém " + pares.length + " elementos");
        
        System.out.println("O Array nomes contém " + impares.length + " elementos");
        
    }
    
}

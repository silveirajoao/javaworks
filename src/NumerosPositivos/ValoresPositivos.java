package NumerosPositivos;

import java.util.Scanner;

public class ValoresPositivos 
{
    
    public static void main(String[] args)
    {
    
        Scanner ler = new Scanner(System.in);
    
        double numero, soma = 0;
        int quantidade = 0;
    
    
        do
        {        
            System.out.println("Digite um numero: ");
            numero = ler.nextDouble();
        
            if (numero > 0)
            {
                soma = numero + soma;
                quantidade++;
            }
        
        }
    
        while (numero >= 0);
        {
            System.out.println("A soma dos números é: " + soma);
        
            System.out.println("A quantidade dos números é: " + quantidade);
        
            System.out.println("A média dos números é: " + soma / quantidade);
        }
    
    }    
    
}

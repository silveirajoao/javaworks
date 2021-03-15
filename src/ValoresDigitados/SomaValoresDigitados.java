package ValoresDigitados;

import java.util.Scanner;

public class SomaValoresDigitados 
{


    public static void main(String[] args) 
    {
        
        Scanner ler = new Scanner(System.in);
        
        double numero, soma = 0;
        
        do
        {
            System.out.println("Digite um número");
            numero = ler.nextDouble();
           
            soma += numero;
                    
        }
        
        while(numero != 0);
        
        System.out.println("Soma do valores: " + soma);
       
        
    }
    
}

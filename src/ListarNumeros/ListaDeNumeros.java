package ListarNumeros;

import java.util.Arrays;
import java.util.Scanner;

public class ListaDeNumeros 
{
    
    public static void main(String[] args)
    {
        
        Scanner ler = new Scanner(System.in);
        
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        
        for (int i = 1; i < 51; i++)
        {
            System.out.println(i);
        }
        
        System.out.println(Arrays.toString(numeros));
        
        System.out.println("O Array contém " + numeros.length + " elementos."); 
        
        System.out.println("====================================================");
        
        System.out.println("Agora vamos somar todos os elementos.");
        
    
    }   
    
}

package ListaDeCompras;

import java.util.ArrayList;
import java.util.Collections;

public class ListarCompras 
{

    public static void main(String[] args)
    {
    
    ArrayList<String> item = new ArrayList<>();
    item.add("Leite");
    item.add("Ovo");
    item.add("Arroz");
    item.add("Carne");
    item.add("Massa");
    
    System.out.println("A lista de compras é:" + item);
    
    item.set (3, "Feijão");
    
    System.out.println("A carne está muito cara, vou trocar por: " + item.get(3));
        
    System.out.println("A lista de compras ficou desse jeito: " + item);
        
    System.out.println("A lista de comprar tem " + item.size() + " itens");
        
    System.out.println("5 itens é muito, melhor tirar o " + item.remove(1));
                
    Collections.sort(item);
        
    System.out.println("Agora a lista, em ordem alfabética, ficou desse jeito: " + item);
        
    item.clear();
        
    System.out.println("Faltou grana... borá devolver tudo");
    
    System.out.println("Depois de todo esse trabalho, tudo que nós compramos foi: " + item);
            
    }
        
    
}

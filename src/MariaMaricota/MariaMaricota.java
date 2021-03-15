package MariazinhaMaricota;

public class MariaMaricota 
{
    
    public static void main(String[] args)
    {
    
        double mariazinha = 150;
        double maricota = 110;
        int ano = 0;
        
        while (mariazinha >= maricota)
        {
            mariazinha = mariazinha + 2;
            maricota = maricota + 3;
            ano = ano + 1;
        }    
      
        System.out.println("A Maricota vai passar a Mariazinha em " + ano + " anos.");
    }
    
}

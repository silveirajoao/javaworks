package View;

public class Livro
{
    
    public String titulo, autor;
    private String genero;
    private int ano;
    private double preco;
    
    public void setGenero (String genero)
    {
        this.genero = genero;
    }
    
    public String getGenero()
    {
        return genero;
    }
    
    public void setAno (int ano)
    {
        this.ano = ano;
    }
    
    public int getAno()
    {
        return ano;
    }
    
    public void setPreco (double preco)
    {
        this.preco = preco;
    }
    
    public double getPreco()
    {
        return preco;
    }        
    
    public String verificarDesconto()
    {
        
        if (this.preco >= 80)
        {
            return "Legal, você ganhou 20% de desconto!";
        }
        
        else
        {
            return "Que pena, você não ganhou os 20% de desconto";
        }
    }
    
}


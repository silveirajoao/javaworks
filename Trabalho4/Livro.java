package Trabalho4;


public class Livro 
{
    
    public String titulo, genero;
    private double preco;
    
    
    public Livro() 
    {
        this.titulo = titulo;
        this.genero = genero;
        this.preco = preco;
    }

    
    public void setPreco(double preco) 
    {
        this.preco = preco;
    }
  
    public double getPreco() 
    {
        return preco;
    }
    
    public String verificarCompra()
    {
    
        if (this.preco >= 0.80)
        {
            return "Parabéns, você ganhou 20% de desconto, o valor final da compra foi de: " + (this.preco)*0.80;
        } 
    
        else
        {
            return "Que pena, você não ganhou desconto, o valor final da compra foi de: " + this.preco;
        }
    
    } 
    
}

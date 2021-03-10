package Trabalho4;


public class Cliente 
{

    public String nome;
    public byte idade;
    private double renda;

    public Cliente() 
    {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }
    
    public void setRenda (double renda)
    {
        this.renda = renda;
    }
    
    public double getRenda()
    {
        return renda;
    }
    
    public String verificarRenda()
    {
        if(this.renda > 1000)
        {
            return "Legal! Você passou o limite mínimo para poder comprar um livro!";
        }
        
        else if(this.renda == 1000)
        {
            return "Ufa, você atingiu EXATAMENTE o limite mínimo para poder comprar um livro.";
        }            
        
        else
        {
            return "Que pena... você não atingiu o limite mínimo para poder comprar um livro, mas vou te dar uma chance dessa vez.";
        }
            
    }
    
}

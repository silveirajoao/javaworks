package view;

public class Cliente
{

    String nome;
    private int idade;
    private double renda;
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }        
    
    public String getNome()
    {
        return nome;
    }        
    
    public void setIdade(int idade)
    {
        this.idade =idade;
    }
    
    public int getIdade()
    {
        return idade;
    }        
    
    public void setRenda(double renda)
    {
        this.renda = renda;
    }
    
    public double getRenda()
    {
        return renda;
    }
    
    public String classificarIdade()
    {        
    
        if (this.idade >= 18)
        {
            return " você é maior de idade";  
        }
    
        else
        {
            return " você é menor de idade";
        }   
    
       
    }
    
    public String classificarRenda()
    {
        if (this.renda >= 15000)
        {
            return " e também é rico.";
        }
        
        else
        {
            return " e também é pobre.";
        }    
    }        
            
    
}

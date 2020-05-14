public class Person
{
    protected String nomPrenom;
    protected boolean salarieEntreprise;
    protected double prime;
    public Person(String name, boolean salarie)
    {
        nomPrenom = name;
        salarieEntreprise = salarie;
    }
    
    public void setPrime(double money)
    {
        prime = money;
    }
        
    public String affiche()
    {
        if(salarieEntreprise == true)
        {
            return("salarie de l'entreprise");
        }
        else
        {
            return("salarie interimaire");
        }
    }
    
    public String getName()
    {
        return(nomPrenom);
    }
    
    public double getPrime()
    {
        return(prime);
    }
}

public class Staff extends Person implements IPerson
{
    private int anciennete;
    
    public Staff(String name, int annees, boolean isSalarie)
    {
        super(name, isSalarie);
        anciennete = annees;
    }
    
    public void calculPrime()
    {
        super.setPrime(anciennete * 150);
    }
    
    public String affiche()
    {
        return(super.affiche() + " Nom : " + nomPrenom + ", a une prime de : " + prime + ", " + anciennete+" ans d'anciennete.");
    }
    
}

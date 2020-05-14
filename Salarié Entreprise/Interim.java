public class Interim extends Person implements IPerson
{
    private int salaire;
    private int nbMois;
    
    public Interim(String name, int wage, boolean isSalarie, int mois)
    {
        super(name, isSalarie);
        salaire = wage;
        nbMois = mois;
    }
    
    public void calculPrime()
    {
        super.setPrime(200+(nbMois/12)*0.1*salaire);
    }
    
    public String affiche()
    {
        return(super.affiche() + " Nom : " + nomPrenom + ", a une prime de : " + prime);
    }
    
}

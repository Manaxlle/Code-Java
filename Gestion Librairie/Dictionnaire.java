import java.io.*;
public class Dictionnaire extends Doc
{
    int nbMot;
    
    public Dictionnaire(String titre, int nb, double prix)
    {
        super(titre, prix);
        nbMot = nb;
    }
    
    public String affiche()
    {
        super.affiche();
        String str = (nbMot+" mots definis");
        return(str);
    }
    
}

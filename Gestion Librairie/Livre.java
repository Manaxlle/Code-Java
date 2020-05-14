import java.io.*;
public class Livre extends Doc
{
    String auteur;
    int nbPage;
    
    public Livre(String name, String author, int nbr, double prix)
    {
        super(name, prix);
        auteur = author;
        nbPage = nbr;
    }
    
    public String affiche()
    {
        super.affiche();
        String str = ("Par "+auteur+", "+nbPage+" pages");
        return(str);
    }
    
}
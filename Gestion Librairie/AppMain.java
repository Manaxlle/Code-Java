import java.util.*;
public class AppMain
{
    static public void main()
    {
        Documents Index = new Documents();
        Livre roman = new Livre("100 years of solitude", "Gabriel Garcia Marquez", 300, 15);
        Livre theatre = new Livre("Death of Salesman", "Arthur Miller", 150, 5);
        Dictionnaire LepetitRobert = new Dictionnaire("Le Petit Robert", 50000, 30);
        
        Index.ajouter(roman);
        Index.ajouter(LepetitRobert);
        Index.ajouter(theatre);
        
        Index.lister();
        
        Index.getMontantLivres();
        Index.getMontantDictionnaires();   
    }
}

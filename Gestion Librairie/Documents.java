import java.util.*;
public class Documents
{   
    private ArrayList<Doc> tab;
    
    public Documents()
    {
        tab = new ArrayList<Doc>();
    }
    
    public void ajouter(Doc document)
    {
        tab.add(document);
    }
    
    public void lister()
    {
        for(int i =0; i<tab.size(); i++)
        {
            Doc d = tab.get(i);
            System.out.println(d.affiche());
        }
    }
    
    public void getMontantLivres()
    {
        Doc d; 
        double prix = 0;
        
        for(Iterator iter = tab.iterator();iter.hasNext();){
            d = (Doc)iter.next();
            
              if (d instanceof Livre ){
                 prix = prix + d.getPrix();
            }
        }     
        System.out.println(prix + "€");
    }
    
    public void getMontantDictionnaires()
    {
        Doc d; 
        double prix = 0;
        
        for(Iterator iter = tab.iterator();iter.hasNext();){
            d = (Doc)iter.next();
            
              if (d instanceof Dictionnaire ){
                 prix = prix + d.getPrix();
            }
        }     
        System.out.println(prix + "€");
    }
}
    

import java.util.*;
public class Database
{
    private ArrayList<IPerson> listeSalaire;
    
    public Database()
    {
        listeSalaire = new ArrayList<IPerson>();
    }
    
    public void listAll()
    {
        for(int i = 0; i<listeSalaire.size(); i++)
        {
            IPerson p = listeSalaire.get(i);
            System.out.println(p.affiche());
        }
    }
    
    
    public void addPerson(IPerson p)
    {
        p.calculPrime();
        listeSalaire.add(p);
        
    }
}

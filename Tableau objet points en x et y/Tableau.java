import javax.swing.*;
public class Tableau
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int taille;
    private Point tab[];
    private int nbPtPositif;
    
    public Tableau (int t)
    {
        // initialisation des variables d'instance
        taille = t;
        tab = new Point[taille];
    }
    
    public void initTab()
    {
        // initialisation des variables d'instance
        for (int i=0; i<taille; i++)
        {
            tab[i] = new Point("Point " + i);
   
        }
    }
    
    public void affichePoint()
    {
        // initialisation des variables d'instance
       
        System.out.println("Liste de points:"); 
        for(int i=0 ; i<taille ; i++)
        {          
            System.out.print ("Point " + i + ": ");
            tab[i].affiche(); 
        }                
    }
    
    public void searchPositifs()
    {
        // initialisation des variables d'instance
        System.out.println("Liste de points positifs:"); 
        int x1, y1 ; 
        
        for (int i=0; i<taille; i++) {
            x1 = tab[i].getX();
            y1 = tab[i].getY();
            
            if ((x1>0)&&(y1>0))
            {
                 System.out.print ("Point " + i + ": ");
                 tab[i].affiche();
                 nbPtPositif++;
            }
            
        }
        System.out.println("Nombre de points positifs: "+nbPtPositif);    
    }
}

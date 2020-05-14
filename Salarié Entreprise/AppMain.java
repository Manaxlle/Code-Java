public class AppMain
{
    static public void main()
    {
        Interim DupontCamille = new Interim("Dupont Camille",15,false,2000);
        Interim OrterAdrien = new Interim("Orter Adrien",35,false,4000);
        Interim DeforgeXavier = new Interim("Deforge Xavier",5,false,3000);
        Staff PierreAntoine = new Staff("Pierre Antoine",24,true);
        Staff DelucasArmand = new Staff("Delucas Armand",10,true);
        
        Database ListE = new Database();
        ListE.addPerson(DupontCamille);
        ListE.addPerson(OrterAdrien);
        ListE.addPerson(DeforgeXavier);
        ListE.addPerson(PierreAntoine);
        ListE.addPerson(DelucasArmand);
        ListE.listAll();
    }
}

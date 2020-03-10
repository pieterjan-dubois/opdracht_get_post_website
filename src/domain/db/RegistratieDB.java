package domain.db;
import domain.model.Registratie;
import java.util.ArrayList;
public class RegistratieDB {
    private ArrayList<Registratie> leden = new ArrayList<Registratie>();

    public RegistratieDB(){
        Registratie l1=new Registratie("Piet","Dubois","piet.dubois","test123","piet.dubois@hotmail.com","3");
        Registratie l2=new Registratie("Tom","Ausloos","tom.ausloos","test1234","tom.ausloos@hotmail.com","1");
        Registratie l3=new Registratie("Anton","Merg","anton.merg","test12345","anton.merg@hotmail.com","4");

        this.add(l1);
        this.add(l2);
        this.add(l3);
    }

    public ArrayList<Registratie> getLeden(){return leden;}

    public void add(Registratie registratie) {
        if(registratie == null) throw new IllegalArgumentException("Deze registratie bestaat niet");
        leden.add(registratie);
    }
}

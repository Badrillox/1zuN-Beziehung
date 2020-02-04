package models;

import java.util.List;

public class Mpreis {

    private String _leiter;
    private String _abteilungen;
    private Filiale _fillialen;

    public String getLeiter(){return this._leiter;}
    public void setLeiter(String leiter){this._leiter = leiter;}
    public String getAbteilungen(){return this._abteilungen;}
    public void setAbteilungen(String abteilungen){this._abteilungen = abteilungen;}
    public Filiale getFillialen(){return this._fillialen;}
    public void setFillialen(Filiale fillialen){this._fillialen = fillialen;}

    public Mpreis(){this("", "", null);}
    public Mpreis(String leiter, String abteilungen, Filiale filialen){
        this.setAbteilungen(abteilungen);
        this.setFillialen(filialen);
        this.setLeiter(leiter);
    }
    @Override
    public String toString(){
        return "Leiter: " + this.getLeiter() + "Abteilungen: " + this.getAbteilungen() +
                                               "Fillialen: " + this.getFillialen();
    }
}

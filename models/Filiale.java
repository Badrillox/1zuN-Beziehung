package models;

public class Filiale {
    private String _filliale;
    private long _anzahl;

    public String getFilliale(){
        return this._filliale;
    }
    public void setFilliale(String filliale){
        this._filliale = filliale;
    }
    public long getAnzahl(){return this._anzahl;}
    public void setAnzahl(long anzahl){if(anzahl >0){this._anzahl = anzahl;}}

    public Filiale(){this("", 0);}
    public Filiale(String filliale, int anzahl){
        this.setAnzahl(anzahl);
        this.setFilliale(filliale);
    }
    @Override
    public String toString(){
        return "Fillialenanzahl: " + this.getAnzahl() + "Fillialenname: " + this.getFilliale();
    }
}

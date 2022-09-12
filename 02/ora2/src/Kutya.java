// minden class referencia típus
public class Kutya {
    // mezők, együttesük az adatszerkezet
    private String nev; // minden ref típus alapértelmezettje a null
                // null: sehova se mutat
    private int labakSzama = 4; // érték típus, az int alapért. értéke 0.
    private double suly;
    private boolean fiu;
    // ref típus nagy betűvel kezdődik
    // érték típus kis betűvel kezdődik

    // metódus = függvény
    public void setNev(String ujNev){   // fej: módosítók, visszatérési típus, név, (formális paraméter lista)
        // public: láthatósági szint
        // void: visszatérési típus
        // voidos fg-ek: eljárás, procedure
        // setNev: név
        // függvénynek nincs kulcsszava
        if (Character.isLowerCase(ujNev.charAt(0))){
            String ujNev2 = Character.toUpperCase(ujNev.charAt(0)) + ujNev.substring(1);
            ujNev = ujNev2;
        }
        nev = ujNev;
    }
    public String getNev(){return nev;}

    public void setLabakSzama(int ujLabakSzama){
        if (ujLabakSzama<=4){
            labakSzama = ujLabakSzama;
        }
    }
    public int getLabakSzama(){return labakSzama};

    public double getSuly() {return suly;}
    public void setSuly(double ujSuly){
        if (ujSuly>0){
            suly = ujSuly;
        }
    }

    public boolean isFiu() {
        return fiu;
    }

    public void setFiu(boolean fiu) {
        this.fiu = fiu;
    }
    // this: Az a referencia, ami az aktuális példányra mutat
    // lyuk a hatáskörben, ha egy lokális változót ugyan úgy hívnak, mint egy globálist.
}

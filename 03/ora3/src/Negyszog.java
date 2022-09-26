public class Negyszog {
    private double a,b,c,d;

    // Privát: csak én látom

    public Negyszog(double a, double b, double c, double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    // Hanyas sorban kezdődik a constructor? - 4
    // Konstruktor neve megegyezik az osztály nevével


    // Konstruktor hív konstruktort
    // Téglalap konstruktor csak a-t és b-t kap
    // 2 paraméteresből hívjuk a 4 paraméterest.
    public Negyszog(double a, double b){
        this(a,b,a,b); // konstruktorban konstruktort hívunk
    }
    // 1 parameteresbol hivom a 4 parameterest

    public Negyszog(double a){
        this(a,a,a,a);
    }

    /*public Negyszog(){
        // sírunk, mert a konstruktor feladata, hogy az összes mezőnek értéket adjon.
    }*/

}

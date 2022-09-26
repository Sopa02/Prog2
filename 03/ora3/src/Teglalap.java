public class Teglalap extends Negyszog{
    // OOP 3 alapelve: öröklődés, egységbezárás, többalakúság
    // öröklődés: extends
    // class gyermek extends ős

    // Explicit konstruktor:
    // 0 paraméteres, és meghívja az ős 0 paraméteres konstruktorát
    // Hiba:
    // A: Nem írtunk auto konstruktort
    // B: Az ősben nincs 0 paraméteres konstr.
    // C: Az ős minden mezője privát

    // Válasz: B

    // Explicit konstruktor csak akkor van, ha egyáltalán nem írunk konstruktort.


    public double getA(){
        return a;
    }

    public Teglalap(double a, double b){
        super(a,b);
        assert(a==c && b==d);

        // IMPLICIT ÉS EXPLICIT ROSSZUL HASZNÁLVA, MEGFORDÍTANI
    }

}

public class Main {
    public static void main(String[] args) {
        Negyszog n1 = new Negyszog(3.8,2.8,4,3);
        Negyszog n2 = new Negyszog(4,5);
        Negyszog n3 = new Negyszog(6);
        Negyszog n4 = new Teglalap(3,5);
        // Többalakúság, az öröklődési láncon felfelé megkapok minden típust
    }
}
// Nyomkövetés: f7 - step into; f8 - step over
// A step over egy lépésben hajt végre metódus hívást
// A step into belelép a metódus hívásba


// Kérdés: mit kell a new után írni?
// A: metúdus hívást
// B: egy típust
// C: konstruktor hívást
// Válasz:  C

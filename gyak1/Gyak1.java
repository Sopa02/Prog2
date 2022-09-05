import java.lang.Math;
import java.util.Random;
// Gyak1 osztály, extends után ősosztály (itt Object a neve.) Minden osztály-hierarchia tetején az Object van.
public class Gyak1 extends Object {
    public static void main(String[] args) {
        // Deklaráció
        // mit: egy új nevet, jelen esetben: o1
        // Lokális változó deklarációja
        // Típus, név1 = kezdőértrék

        int i = 1;                  // Érték típusú
        Object o1 = new Object();   // Referencia típusú

        // Minden ami osztály példány, az referencia típusú
        // Az o1 az Object osztály egy példánya.
        // Példányt létrehozni  new  kulcsszóval kell, a new után konstruktort kell hívni.

        // Az Object osztály metúdusait mindenki megörökli.
        // Egy osztály két részből áll: 1.Mezők (Attributes), 2.Metódusok (Methods), Az egységbezárás elve szerint.
        // OOP - object oriented programming


        Random rnd = new Random();
        System.out.println(1 + rnd.nextInt(0, 101));
    }
}


/*
* A név betűvel, aláhúzással kezdődik, betűvel, számmal, aláhúzással folytatódik. Identifier
*
*
* Az osztály nevét nagybetűvel kezdjük, minden új szót nagy betűvel kezdünk, és egybe írjuk.
*
* Clean code. lásd: bob bácsi könyvei (Uncle Bob: Robert C. Martin : Clean code)
*
* class - osztály
* enum - felsorolás
* interface
* record - rekord
*
* Mindent importálni kell, kivéve azt, ami a lang-ban van
*
* Az identifier nem lehet kulcsszó
*
* Javaban egyszeres öröklődés, minden osztálynak egy őse van, kivéve az Objectnek, annak 0.
* Habár egyszeres öröklődés van, ez kijátszható az intefészek segítségével.
* Interfészek kulcsszava az implements, az implements szó után akárhány interfészt lehet írni.
*
*
*
* */
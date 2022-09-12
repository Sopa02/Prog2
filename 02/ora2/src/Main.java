public class Main {
    public static void main(String[] args) {
        // Kutya: osztály
        // k1: Kutya oshztály egy példánya
        Kutya k1 = new Kutya();
        // konstruktort nem írtunk, default konstruktor hívódik
        // ilyenkor minden mező alapértelmezett értéket kap
        // int: 0, string: null
        // most az osztály mezők létrehozásánál adtunk alap értéket.

        k1.setNev("buksi");
        System.out.println(k1.getNev());


        // a new helyet foglal a dinamikus memoriában, meghívja a konstruktort, az beállítja a kezdőértéket,
        // és visszaadja a referenciát
        // azaz a new 3 dolgot csinál.
        // - helyet foglal
        // - konstruktort hív
        // - visszaadja a referenciát

        // A pointer és a referencia is egy cím a memóriában, de a referencia értéke nem változtatható, a pointeré igen
        // A referencia egy olyan pointer, melynek értékét nem lehet megváltoztatni

        // Amit a new lefoglal, azt nem kell kézzel felszabadítani, hanem azt a GC - GarbageCollector - megteszi automatikusan.
        // --> A Java-ban nem lehet(!!) Real Time rendszereket írni

        // k1 értéke egy mem. cím, ami speciálisan lehet null

        // A memória két részből áll, STACK és HEAP, verem és halom
        // Stack: lokális változók      Heap: dinamukis memória

        // Létrejött egy új kutya példány, aminek a referenciáját megkapja a k1

        // k1.nev = "Buksi"; // Az egységbezárás miatt ilyet nem szabad.
    }
}

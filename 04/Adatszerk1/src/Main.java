public class Main {
    public static void main(String[] args) {
        Kutya k1 = new Kutya("Buksi");
        Kutya k2 = new Kutya("Pityu");
        k1.feed(10);

        System.out.println(k1.getFoodLevel());
        System.out.println(k2.getFoodLevel());

        k1.run();
        k2.run();

        System.out.println(k1.isAlive()); // True
        System.out.println(k2.isAlive()); // False

        System.out.println(k1);
        System.out.println(k2);
        // Ha referenciát iratnánk ki, automatikusan meghívja a toString-et

    }
}
/*
 * clean code elv: fentről lefelé lehessen olvasni
 * ne kelljen fel-le ugrálni a kódban
 *
 * Praktikusan: főprogram, aztán amit először hív, stb..
 *
 * Mi a class?
 * Adatszerkezet
 *
 * 1. egyszerű v összetett?
 *  -- Ha összetett --
 * 2. folytonos v szétszórt
 * 3. homogén v inhomogén (heterogén)
 * 4. soros v direkt (szekvenciális v asszociatív)
 *
 * -- A tömb:
 *       összetett, folytonos, homogén, direkt
 * -- Egyirányba láncolt lista:
 *       összetett, szétszórt, homogén, soros
 * -- Rekord:
 *       összetett, folytonos, heterogén, direkt
 *       A rekord mezőkből áll, bármilyen típusúak lehetnek
 *       Hozzáférni: rekordNeve.mezoNeve
 * -- Class:
 *       rekord, + a rekordon végrehajtható műveletek
 *       A class mezőkből és metódusokból áll --Egységbezárás
 *
 *       Az adatszerkezetet és az azon végrehajtható műveleteket
 *       egy egységbe zárom, és ezt osztálynak nevezem.
 *
 *       A mezők az osztályon belül globális változók.
 *       Globális változót használni veszélyes
 *       Def(mellákhatás):
 *       Azt mondjuk, hogy egy alprogramnak mellékhatása van akkor és csak akkor,
 *       ha megváltoztatja a környezetét, azaz globális változónak értéket ad.
 *       A mellékhatás erősen kerülendő, mert nehezen megtalálható hibákhoz vezethet
 *
 *       A mező olyan globális változó, ami lokális.
 *       Az osztályon belül lokális.
 *       Amíg az osztály kb 100 soros, addig nem okoz gondot.
 *
 *          A nagy osztálynál a megoldás az SRP: Single Responsibility Principle
 *
 ***************************************************
 *       Belső állapot: a mezők pillanatnyi értéke
 ***************************************************
 *
 *
 *
 *  * */
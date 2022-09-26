public class Negyzet extends Negyszog {
    public Negyzet(double a){
        super(a);
        assert(a==b && a==c && a==d);
    }
}
// Konstruktorból konstruktor hívás helye a konstruktor legelső sora.
// Konstruktorból konstruktort hívni CSAK a konstruktor első sorában lehet.
// Ha nem írsz semmit, az olyan mintha azt írtad volna, hogy super()
// Azaz hívod az ős 0 paraméteres konstruktorát

// Assert - feltételez
// Használata: assert(-logikai kifejezés-)
// Feltételezem, hogy a program futásának ezen a pontján a feltétel igaz
// Dinamikus ellenőrzés
/*
*               Nem szeretik, mert:
* Időt vesz el
* Ki-be lehet kapcsolni
* Inkább logolnak
* Amikor ők születtek, akkor még nem volt. --volt csak nem tanulták
* Assert helyett elterjettebb a sonarcube és a findbox
* --De ők statikus ellenőrzést csinálnak
*
* Ha assertet használsz, beismered hogy valami rossz lehet
* */


//
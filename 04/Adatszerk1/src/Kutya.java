public class Kutya {
    private int foodLevel;
    private String name;
    //Van a metódusnak mellékhatása?
    public Kutya(String name){                 // Van
        this.name = name;
        foodLevel = 1;
    }
    public void run(){              // Van
        this.foodLevel -= 5;
    }
    public void feed(int foodAmount){

        if (this.foodLevel<=0) return;
        // max foodlevel: 100
        if ((this.foodLevel + foodAmount)>100){
            this.foodLevel = 100;
        }else{
            this.foodLevel += foodAmount;
        }
    }
    public boolean isAlive(){
        return this.foodLevel>0;
    }
    public int getFoodLevel() {
        return foodLevel;
    }

    // A to-String-et örököljük az Object-től, ezt felüldefiniálhatom
    @Override
    public String toString(){
        // fel kell használni az összes mezőt
        return "Name: " + this.name +(isAlive()?"\t:)":"\tRIP")+ '\n' + "Food level: " + this.foodLevel ;
    }
    // Két objektum egyenlő, ha a belső állapotuk egyenlő
    // k1 == k2 csak akkor lenne igaz, ha ugyan arra a memóriacímra mutatnának
    // k1 equals k2 -- a két kutya belső állapota ugyan az?

    @Override
    public boolean equals(Object o){
    Kutya other = (Kutya)o;
    return this.foodLevel == other.foodLevel && this.name.equals(other.name);
    }
}

// Mivel férek hozzá a belső állapotomhoz?
// this

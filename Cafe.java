/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    //attributes
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    //constructor
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 1000;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        this.nCups = 50;
        System.out.println("You have built a cafe: ☕");
    }
    
    //methods
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces<size||this.nSugarPackets<nSugarPackets||this.nCreams<nCreams||this.nCups<1){
            restock(1000, 100, 100, 50);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    public String toString() {
        return super.toString() + "with an inventory containing " + nCoffeeOunces + " ounces of coffee, " + nSugarPackets + " packets of sugar, " + nCreams + " 'splashes' of cream, and " + nCups + " cups."; 
    }

    public static void main(String[] args) {
        Cafe cafe = new Cafe("Compass", "7 Neilson Drive", 2);
        System.out.println(cafe);
        cafe.sellCoffee(12, 2, 3);
        System.out.println(cafe);
        cafe.sellCoffee(12, 100, 3);
        System.out.println(cafe);
        cafe.sellCoffee(12, 2, 3);
        System.out.println(cafe);
        cafe.sellCoffee(12, 2, 3);
        System.out.println(cafe);
    }
    
}

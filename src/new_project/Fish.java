// Fish.java
package new_project;

public class Fish {
    private String species;
    private int size;
    private double price;

    public Fish(String species, int size, double price) {
        this.species = species;
        this.size = size;
        this.price = price;
    }

    public String getSpecies() {
        return species;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Species: " + species + ", Size: " + size + ", Price: $" + price;
    }
}

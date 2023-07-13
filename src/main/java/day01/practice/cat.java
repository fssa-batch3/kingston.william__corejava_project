package day01.practice;

public class cat {
    // Attributes
    private boolean hasDots;
    private String color;

    // Constructor
    public cat(boolean hasDots, String color) {
        this.hasDots = hasDots;
        this.color = color;
    }

    // Getters and setters
    public boolean hasDots() {
        return hasDots;
    }

    public void setHasDots(boolean hasDots) {
        this.hasDots = hasDots;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String speak() {
        return ("meow!");
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        cat cat1 = new cat(true, "orange and white ");
        cat cat2 = new cat(true, "dark orange and white");

        // Print the attributes of each Dog
        System.out.println("cat 1:");
        System.out.println("Has Dots: " + cat1.hasDots());
        System.out.println("Color: " + cat1.getColor());
				System.out.println("Speaks: " + cat1.speak());

        System.out.println("cat 2:");
        System.out.println("Has Dots: " + cat2.hasDots());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat1.speak());
    }
}
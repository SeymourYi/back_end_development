public class Animal {
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }
public void eat(String food){
    System.out.println("eat" + food);
}
    public Animal(String name, String color, int legs) {
        this.name = name;
        this.color = color;
        this.legs = legs;

    }
}

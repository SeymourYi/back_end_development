public class Bird extends Animal{
private int wings;

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("eating finished");
    }

    public Bird(String name, String color, int legs, int wings) {
        super(name, color, legs);
        this.wings = wings;
    }
public void fly(){
    System.out.println(this.getName() + "is flying");
}
    public void fly(int speed){
        System.out.println(speed + "is flying speed");
    }
    public void fly(String name){
        System.out.println(name + "name flying speed");
    }
    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}

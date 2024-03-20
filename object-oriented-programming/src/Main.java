public class Main {
    public static void main(String[] args) {
//        Phone iPhone = new Phone("iPhone 11",5,8,8);
//        iPhone.name = "redmi";
//        System.out.println(iPhone.name);
//        iPhone.setMemoryRam(8);
//        iPhone.playMusic("our wings are burning");
//        iPhone.playMusic("Lamenting Kiss");
//
//        Phone pixel = new Phone("pixel 1",5,5,5);
//        System.out.println(pixel.name);
//    Bird phoenix = new Bird("nina","golden",2,2);
//        System.out.println(phoenix.getName());
//        phoenix.eat("meat");
//        phoenix.fly();
//        phoenix.fly("100");
//        phoenix.fly(100);

//Engine engine = new Engine("renault",8000);
Car car = new Car("Mercedes",2,"Silver",new Engine("Renault",8000));
        System.out.println(car.getName());
        System.out.println("Engine Model: " + car.getEngine().getModel());
    }
}
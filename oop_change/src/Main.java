public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Brad", 28,
                new Eye("left eye","short sighted","blue",true),
                new Eye("Right eye","normal","blue",true),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach","pud",false),
                new Skin("skin","Burned","white",40)
        );
        System.out.println("Name: "+patient.getName());
        System.out.println("Age: "+patient.getAge());

    }



//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
}
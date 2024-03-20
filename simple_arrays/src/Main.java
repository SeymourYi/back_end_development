import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] name = {"刘德华","朴正熙","萧朝贵","阿伏伽德罗"};
        int[] number = {123,423,566,789};
//        for (int i = 0; i < number.length; i++) {
//            System.out.println(name[i]);
//        }
        System.out.println("plase inter a name");
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.next().toString();
        for (int i = 0; i < number.length; i++) {
            if (userinput.equals(name[i])){
                System.out.println(name[i]+"电话为"+number[i]);
            }
        }
     }
}
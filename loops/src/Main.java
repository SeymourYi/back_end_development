import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 5;
        do {
            System.out.println(a);
            a++;
        }while (a<10);

        System.out.println("Plase Enter A number");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        System.out.println("123"+answer);
     }
}
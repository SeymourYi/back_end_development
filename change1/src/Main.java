import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        System.out.println("wellcome to play the game");
//        System.out.println("may i ask what's your name?");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println("wellcome  " + name + " !");
//        System.out.println("shall we star?");
//        System.out.println("\t1.start now");
//        System.out.println("\t2.later start");
//        Scanner scanner1 = new Scanner(System.in);
//        int value = scanner1.nextInt();
//        while(value != 1 ){
//            System.out.println("shall we start?");
//            System.out.println("\t1.start now");
//            System.out.println("\t2.later start");
//            value = scanner1.nextInt();
//        }
//        Random random = new Random();
//        System.out.println("plase guss a number");
//        int key = random.nextInt(10) + 1;
//        Scanner scanner2 = new Scanner(System.in);
//        int UserInput = scanner2.nextInt();
//        Boolean should_finsh = false;
//        int trytimes = 0;
//        while (should_finsh != true){
//            if (trytimes<5) {
//                trytimes++;
//                if (UserInput == key) {
//                    System.out.println("you win!");
//                    System.out.println("Game over!");
//                    should_finsh = true;
//                } else if (UserInput > key) {
//                    System.out.println("you guss bigger");
//                } else {
//                    System.out.println("you guss loser");
//                }
//            }else {
//                System.out.println("you lost the game");
//                should_finsh = true;
//            }
//            if(should_finsh != true){
//                UserInput = scanner2.nextInt();
//            }
//        }





        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        int F = (C * 9 / 5) + 32;
        System.out.println("对应的值为"+F);

//        System.out.println(num/n);



     }
 }
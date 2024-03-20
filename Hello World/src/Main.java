//public class Main {

//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.print("Hello world!");
//        TODO DO something

//         int number = -5;
//         System.out.println(number);
//
//         long mylong = 5;
//         System.out.println(mylong);
//
//         double myduble = 4.5;
//         System.out.println(myduble);
//
//         float myfloat = (float) 4.5;
//         System.out.println(myfloat);
//
//         char mychar = 'M';
//         char mychar0 = '\u00AE';
//         System.out.println(mychar);
//         System.out.println(mychar0);
//
//         String name = "Meisam";
//         System.out.println(name);
//
//         Boolean myBoolean = true;
//         System.out.println(myBoolean);

//        int a = 7;
//        int b = 2;
//        double answer = (double) a / b;
//        System.out.println(answer);
//
//       String firstName = "Emma ";
//       String lastName = "Watson";
//       String fullName = firstName + lastName;
//       System.out.println( "hello world");
//        runnian();
//
//    }
//}
//public static int pot(int n){
//    int sum = 1;
//    for (int i = 1; i <=n ; i++) {
//        sum=sum*i;
//    }
//  return sum;
////    System.out.println(sum);
//}
//public static void loop_pot(int n){
//    int sum = 0;
//    for (int i = 1; i <=n; i++) {
//       sum=sum+pot(i);
//    }
//    System.out.println(sum);
//}
//public boolean isrunnian(){
//
//
//}

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        // 获取当前年份

        int currentYear = Year.now().getValue();
//        System.out.println(Runtime.getRuntime());

        // 调用方法检查是否是闰年并打印结果
        if (isLeapYear(currentYear)) {
            int time = 18+30+30;
            System.out.println(currentYear + " 年是闰年。今天是第"+time);
        } else {
            int time = 18+28+30;
            System.out.println(currentYear + " 年不是闰年。今天是第"+time);
        }
    }

    // 判断是否是闰年的方法
    public static boolean isLeapYear(int year) {
        // 四年一闰，百年不闰，四百年再闰
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

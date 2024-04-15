import java.util.Scanner;

public class b_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Math.max(Math.max(num1,num2),num3);
        int min = Math.min(Math.min(num1,num2),num3);
        System.out.println(max+ "큰수");
        System.out.println(min + "작은수");
//        if (Math.max(num1, num2) < num3) {
//            System.out.println(num3+" 가장큰수");
//        }
//        else {
//            System.out.println(Math.max(num1, num2)+" 가장큰수");
//        }
//        if (Math.min(num1, num2) > num3) {
//            System.out.println(num3+" 가장작은수");
//        } else System.out.println(Math.min(num1, num2)+" 가장작은수");
//
    }

}
import java.util.Scanner;

public class b_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();


    System.out.println(num1+ num2);
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    if (num2 == 0){
    System.out.println("0으로 나눌수 없습니다");
}else {
    System.out.println(num1 / num2);

}




//
//        switch (sum){
//            case "+":
//                System.out.println(num1 + num2);
//                break;
//            case "-":
//                System.out.println(num1 - num2);
//                break;
//            case "*":
//                System.out.println(num1 * num2);
//                break;
//                case "/"

        }
    }


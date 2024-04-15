import java.util.Scanner;

public class a_2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        String name = input.nextLine();

        if (isNotDigit(name)) {
            System.out.println("이름에 숫자는 No!");
            return;
        }
        String age = input.nextLine();



        if (!isDigfit(age)) {
            System.out.println("나이에 문자는 No!");
            return;
        }
        System.out.printf("사용자의 이름은 %s 나이는 %s", name, age);
    }

public static boolean isNotDigit(String str){
    String digit = "0123456789";
    for (int i = 0; i < str.length(); i++) {
        if (digit.indexOf(str.charAt(i)) != -1) {
            return true;
        }
}
    return false;
    }
    public static boolean isDigfit(String str) {
        String digit = "0123456789";
        for (int i = 0; i < str.length(); i++) {
            if (digit.indexOf(str.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

}






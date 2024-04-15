import java.util.Scanner;

public class c_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 조건문으로 각 양수 음수 0 일때의 조건으로 표시

        System.out.printf("숫자를 입력해 주세요");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.print("0입니다");
        } else if (num > 0) {
            System.out.print("양수입니다.");
        } else  {
            System.out.print("음수입니다.");
        }
    }
}

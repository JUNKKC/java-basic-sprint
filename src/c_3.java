import java.util.Scanner;

public class c_3 {
    public static void main(String[] args) {
        // 사용자로부터 숫자를 받아 1부터 n까지 합한 값을 출력
        //반복문으로 0부터 n까지 덧셈 1부터니 음수는 예외 시키기
        // 음수를 입력하면 반복문이 실행 되지 않으니 신경 x
        //

        Scanner sc = new Scanner(System.in);


        int number =0;
        int num = sc.nextInt();

        for (int i = 0; i <= num; i ++){
            number = number + i;
        }
        System.out.println("1부터 n("+num+")까지의 합은"+number+"입니다");
    }
}

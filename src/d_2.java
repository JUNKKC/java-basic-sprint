import java.util.Arrays;
import java.util.Scanner;

public class d_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자 한테 5명의 점수를 받을 예정
        // 배열의 크기를 5로 설정하고 반복문을 이용하여
    //배열에 넣기
    int num =0;
    int[] nums = new int[5];
    for (int i = 0; i  < nums.length; i++){
        nums[i] = sc.nextInt();
        // 배열에 입력한 값을 할당후에 순서대로 임의의 값 num 에 더해주고
        // 출력할때 나누기 5명으로 출력
        num += nums[i];
    }
        System.out.println(num/5);

    }
}

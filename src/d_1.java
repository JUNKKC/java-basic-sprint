import java.util.Arrays;
import java.util.Scanner;

public class d_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //10개의 정수값을 저장 할수 있는 배열을 만들고 배열에
        // 1부터 10까지 배열에 넣어줘여함
        // for 문을 이용하여 넣어주기

        int[] nums = new int[10];
        // 반복문으로 배열의 갯수 만큼 더해주기 배열의 개수는 .length 사용
      //  System.out.println(nums.length);

        for (int i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }

        // 그냥 배열을 출력할경우 주소값이 나옴
       // System.out.println(nums);
        // 배열의 요소를 출력 하려면 Arrays.toString()사용하기
        System.out.println(Arrays.toString(nums));


    }
}

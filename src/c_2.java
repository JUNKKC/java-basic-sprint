import java.util.Scanner;

public class c_2 {
    public static void main(String[] args) {
        //1,2,3...100 까지 숫자 중 짝수만 출력
        // 2로 나누웠을때 나머지가 0이면 짝수
        // 출력은 어찌하지?
        // 스케너로 숫자를 받고 짝수 여부 및 100 이하의 숫자만 받기 -> x

        //피드백후
        // 스케너로 입력하는게 아닌 1부터 100까지 짝수 출력
        //반복문으로 1부터 100까지 1씩 더해주며
        //2로 나누었을때 나머지가 0 이면 출력
        int num = 1;

        for (int i = 1; i <= 100; i++){
            num+=1;
            if (num%2 == 0){
                System.out.println(num);
            }

        }

    }
}







import java.util.Scanner;

public class d_3 {
    public static void main(String[] args) {
//주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.
        //메서드를 만들어서 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 개수를 입력하세요");
        int [] numbers = new int[sc.nextInt()];
        System.out.println("배열의 개수 만큼 정수를 입력하세요");
    for (int i =0; i < numbers.length; i++)
        numbers[i] += sc.nextInt();

    add(numbers);

    }

    public static void add(int[] num){

    int max  = num[0];
    int min  = num[0];



    for (int i = 0; i < num.length; i++) {
        if (num[i] > max) {
            max = num[i];

        }
        if (num[i] < min) {
            min = num[i];
        }
    }
        System.out.println("최대값  "+max);
        System.out.println("최소값  "+min);

    }
}


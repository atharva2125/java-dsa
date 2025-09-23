import java.util.Scanner;

public class AliceMagicalShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input1
        int N = sc.nextInt();
        int[] A = new int[N];

        // input2
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        for (int stairs : A) {
            if (stairs % 3 == 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

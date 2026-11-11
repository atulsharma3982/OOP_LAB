import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int i = 0, j = 1;
        while (i < j && i < n && j < n) {
            System.out.println(i+" "+j);
            if (arr[i] == 0 && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] != 0)
                i++;
            if (arr[j] == 0)
                j++;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}

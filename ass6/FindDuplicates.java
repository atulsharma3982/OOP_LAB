import java.util.Scanner;

public class FindDuplicates{
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
        System.out.print("Duplicates: ");
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if(count == 1) System.out.print(arr[i]+" ");
        }
    }
}
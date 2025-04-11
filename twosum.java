import java.util.*;
public class twosum{

    static void twosumfun(int[] arr, int t){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] == t) {
                    System.out.println("indexes are " +i+" and " +j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numberof elememts ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Target");
        int t = sc.nextInt();
        twosumfun(arr, t);
    }
}
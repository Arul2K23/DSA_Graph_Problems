import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMonkeys = sc.nextInt();
        int k = sc.nextInt(), j = sc.nextInt();
        int m = sc.nextInt(), p = sc.nextInt();
        int i = 0, count = 0;
    if(k==0 || j==0) System.out.println("Invalid Input");
        System.out.println(totalMonkeys - ((m/k)+(p/j)));
    }
}

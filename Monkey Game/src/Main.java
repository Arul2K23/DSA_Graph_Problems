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

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMonkeys = sc.nextInt();
        int k = sc.nextInt(), j = sc.nextInt();
        int m = sc.nextInt(), p = sc.nextInt();
        int i = 0,flag = Math.min((m/k),(p/k)), count = 0;
        for(i= 0;i<totalMonkeys;i++){
            while(i<totalMonkeys && (m/k) != (p/j)){

                if(Math.max((m/k),(p/j))==m/k){ m-=k; count += k;}
                else{ p-=j; count+= j;}
                i++;
            }


            if(m<k) m = 0;
            if(p < j)p=0;
            count++;
            System.out.println(i+" "+count);
            if(m==0 && p==0) break;

        }
        System.out.println(totalMonkeys - count);
    }
}*/
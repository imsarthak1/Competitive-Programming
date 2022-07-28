import java.util.Scanner;

class FRIMEET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            if (x1==x2) {
                System.out.println("YES");
            }else if (x1<x2) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }  
}

import java.util.Scanner;

class S01E01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n<21) {
                System.out.println("NO");           
            }else{
                System.out.println("Yes");
            }
        }
    }
}
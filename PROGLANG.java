import java.util.Scanner;

class PROGLANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int A1 = sc.nextInt();
            int B1 = sc.nextInt();
            int A2 = sc.nextInt();
            int B2 = sc.nextInt();
            if ((A== A1 && B == B1 )||(A==B1 && B==A1)){
                System.out.println("1");
            }
            else if ((A== A2 && B == B2)||(A== B2 && B == A2)) {
                System.out.println("2");
                
            }else{
                System.out.println("0");
            }
        }
    }    
}

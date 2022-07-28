import java.util.*;

class NAICHEF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int Num[];
                Num = new int[n];
                float count = 0;
                float count2 = 0;
                for(int j = 0;j<n;j++){
                    Num[j]= sc.nextInt();
                    if(A == Num[j]){
                        count ++;
                    }if(B== Num[j]){
                        count2++;
                    }
                }
                System.out.println((count/n)*(count2/n));
        }
    }
}
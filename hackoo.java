package programs;
import java.util.Scanner;
public class hackoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("perfect");
        }
        else {
            System.out.println("Not Perfect");
        }
    }
}

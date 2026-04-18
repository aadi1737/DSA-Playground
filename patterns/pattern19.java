package patterns;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int n=scanner.nextInt();
        int n=10;

        //Upper Pattern
        for(int i=1;i<=n/2;i++){
            
            //star
            for(int j=i;j<=n/2;j++){
                System.out.print("*");
            }

            //space
            for(int j=0;j<(2*i)-2;j++){
                System.out.print(" ");
            }

            //star
            for(int j=i;j<=n/2;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Pattern
        for(int i=1;i<=n/2;i++){
            
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            //space
            for(int j=1;j<=(n-i-i);j++){
                System.out.print(" ");
            }
            
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
// Output-

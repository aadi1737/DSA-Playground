package patterns;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Even number to get Best reuslts:");
        int n=scanner.nextInt();

        for(int i=1;i<=n/2;i++){
            
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            //space
            for(int j=1;j<=n-i-i;j++){
                System.out.print(" ");
            }
            
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Down Pattern
        for(int i=1;i<n/2;i++){
            
            //star
            for(int j=i;j<n/2;j++){
                System.out.print("*");
            }
            
            //space
            for(int j=1;j<=i*2;j++){
                System.out.print(" ");
            }
            
            //star
            for(int j=i;j<n/2;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

// Output-
// Please Enter Even number to get Best reuslts: 12
// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *
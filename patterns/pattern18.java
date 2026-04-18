package patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        char ch='A';
        for(int i=n;i>=0;i--){
            for(int j=i;j<n;j++){
                System.out.print((char)(ch+j)+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
// Output-
// E
// D E
// C D E
// B C D E
// A B C D E
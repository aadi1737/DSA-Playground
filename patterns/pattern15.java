package patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=n;i>=1;i--){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        scanner.close();
    }
}
// Output-
// ABCDE
// ABCD
// ABC
// AB
package patterns;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a='A';
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

// Output-
// A
// AB
// ABC
// ABCD
// ABCDE
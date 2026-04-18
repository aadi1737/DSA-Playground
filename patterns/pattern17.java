package patterns;

public class pattern17 {
    public static void main(String[] args) {
        int n = 5;
        char chu;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (chu = 'A'; chu <= 'A' + i-2; chu++) {
                System.out.print(chu);
            }
            for (char ch = chu; ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}

// Output-
//      A     
//     ABA
//    ABCBA
//   ABCDCBA
//  ABCDEDCBA

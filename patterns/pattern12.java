package patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        // int n=scanner.nextInt();
        int n=4;
        int t;
        for(int i=1;i<=n;i++){
            for(t=1;t<=i;t++){
                System.out.print(t);
            }

            for(int j=1;j<=(n*2-i-t)+1;j++){
                System.out.print(" ");
            }

            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

package for_example;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = N - i-1; j >= 0; j--) {
				System.out.print(" ");
			}
			for(int u = 1; u <= i; u++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

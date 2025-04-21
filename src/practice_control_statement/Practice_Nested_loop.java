package practice_control_statement;

public class Practice_Nested_loop {
	
public static void main(String[] args) {
		
		for(int i = 0; i<=2; i++) { // outer for loop: 0
			// i=0
			// i=1
			// i=2
			for (int j = 0; j<=3; j++) { // inner for loop: 0, 1, 2, 3
				System.out.println(i+j);
				// 0+0 // 0+1 // 0+2 // 0+3
				// 1+0 // 1+1 // 1+2 // 1+3
				// 2+0 // 2+1 // 2+2 // 2+3
//0,1,2,3 -- 1,2,3,4---2,3,4,5
			}			
		}
		
		// if you understand above, that is more than enough
		
		// You don't need to see below if you don't understand above
		// outer loop is incremental
		System.out.println("------Nested fro Loop --Multiplication----");
		for (int i = 0; i <= 5; i += 2) { // 0, 2, 4
			// i=0
			// i=2
			// i=4
			// inner loop is decremental
			for (int j = 10; j > 0; j -= 2) { // 10, 8, 6, 4, 2
				System.out.println(i * j);
				// 0*10, 0*8, 0*6, 0*4, 0*2
				// 2*10, 2*8, 2*6, 2*4, 2*2
				// 4*10, 4*8, 4*6, 4*4, 4*2
			}
		}
		
		// not important, generally never used
		// Below 2 is for example, but try to understand the first one meaning-> for loop inside for loop only
		System.out.println("\n---------- nested loop (here, a while loop inside a for loop) ----------\n\n\n\n\n\n");
		for (int k = 1; k <= 6; k += 2) { // 1, 3, 5
			// from line 41, while loop
			int l = 2;
			while (l <= 4) { // 2, 3, 4
				System.out.println(k * l);
				l++;
			}
		}
		
		// not important
		System.out.println("\n\n\n\n\n\n\n\n---------- nested loop (here, a while loop inside a while loop) ----------\n");
		int m = 1;
		while (m <= 6) {
			// line 53-57 is the inner while loop
			int n = 2;
			while (n <= 4) {
				System.out.println(n * m);
				n++;
			}
			m += 2; // tricky part , where is the first incremental block located
		}


	}


}

import java.util.Scanner;
 
public class Q_1037 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(T-- > 0) {
			int N = in.nextInt();
			max = N > max ? N : max;
			min = N < min ? N : min;
            
		}
		System.out.println(max * min);
	}

}

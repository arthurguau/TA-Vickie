import java.util.Deque;

/**
 * 
 * @author soggu
 *
 */
public class Lesson0303TapeEquilibrium {

	public static void main (String [] args) {
		
		int [] test = {3, 1,2,4,3};
		
		System.out.println(solution (test));
		
		
	}
	
	
	public static int solution (int [] test) {
		
		int temMinimu = test[0];
        int sum = 0;
        for (int i=0; i<test.length; i++) {
        	 sum += test[i];
        }
		
		for (int i=1; i<test.length-1; i++) {
			
		}
		
		return 0;
	}
}

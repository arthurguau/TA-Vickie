import java.util.HashMap;
import java.util.Map;

public class Lesson0202OddOccurrencesInArray {

	public static void main (String[] args) {
		
		int[] A = {3, 9, 3, 9, 6, 7, 6};
		int[] B = {3, 4, 3, 4, 2};
		int[] C = {3,2,3};
		
		System.out.println(" Odd value: " + solution (A));
	}
	
	
	/**
	 * given an array A consisting of N integers with odd number of elements, 
	 * returns the value of the unpaired element.
	 * @return
	 */
	public static int solution (int [] A) {
		
		Map<Integer, Integer> input =  new HashMap<Integer, Integer>(); 
		
		int value = -1;
		for (int i=0; i<A.length; i++) {
			 
			 if (input.containsKey(A[i]))
			     input.put(A[i], 2);
			 else {
				 input.put(A[i], 1);
				 value = A[i];
			 }
		}
		
		return value;
	}
	
	
}

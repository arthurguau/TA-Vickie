import java.util.Arrays;

public class Lesson0201CyclicRotation {
	
	public static void main (String[] args) {
		
		int[] source = {2,4,6,7};  
                int k = 3;
		
		System.out.println("Array to rotate: " + Arrays.toString(source) + "  Rotate " + k + " times");
		System.out.println("Result: " + Arrays.toString( rotate (source, k)));
		
	}
	
	static  int[] rotate (int[] A, int K) {
		
		int length = A.length;
		int index = K % length; 
		int [] B = new int [length];
		
		for (int i=0; i<length; i++) {
			int postion = (index+i)%length;
			B[postion] = A[i];
		}
		return B;
	}

}

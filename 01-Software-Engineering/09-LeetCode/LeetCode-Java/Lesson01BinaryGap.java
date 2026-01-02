public class Lesson01BinaryGap {
	
	public static void main (String[]args) {
		
		String binaryString = toBinary(66632);
		System.out.println("Binart String: " + binaryString);
		
		int binaryGap = binaryGap (binaryString);
		System.out.println("Final Max: " + binaryGap);
		
	}
	
	static int binaryGap (String input) {
		
		int curr = 0, max = 0;  
		boolean start = false, end = false;
		String[] list = input.split("");
		
		for (String temp: list) {
			
			if ("1".equals(temp) && start && !end) {
				end = true;
			}
			
			if ("1".equals(temp) && !end) start = true;
			
			// increase current count
			if ("0".equals(temp) && start && !end) {
				curr ++;
			}
			
			// reset current length = 0, end = false
			if (end && start)  {
				// evaluate max
				if (curr>max) max = curr;				
				System.out.println("Current legth: " + curr + "   Current Max: " + max);
				
				curr = 0;
				end = false;
			}
		}
		
		return max;
	}
	
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	static String toBinary(int input) {
		
		String result = Integer.toBinaryString(input);
		return result;
	}
}

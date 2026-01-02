
public class Lesson0301FrogJmp {
	
	public static void main (String[] args) {
		
		int x=10, y=90, d=20;
		System.out.println("Jump steps: " + jump(x, y,d));
		
		
	}
	
	
	static int jump (int source, int target, int span) {
		
		int steps = Math.round((target - source ) / span);
		
		return steps;
	}

}

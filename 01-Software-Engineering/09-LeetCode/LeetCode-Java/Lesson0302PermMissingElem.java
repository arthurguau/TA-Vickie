import java.util.Arrays;

public class Lesson0302PermMissingElem {
	
	public static void main (String[] args) {
		
		int[] test = {3,2,5,6,7};
		
		System.out.println ("Missing value: " + lookupMissing(test));
		
	}

	
	static int lookupMissing(int[] a) {
        
	    Arrays.sort(a);
		
	    System.out.println (Arrays.toString(a));
	    
	    int gap=0, cur=0, missing=-1;
	    for (int i=0; i< a.length-2; i++) {
	    	
	    	if (a[i+1]-a[i] > a[i+2] - a[i+1]) {
	    		missing = a[i] + 1;
	    	}else if (a[i+1]-a[i] < a[i+2] - a[i+1]) {
	    		missing = a[i+1] + 1;
	    	}
	    }
	    
		return missing;
	}
	
}

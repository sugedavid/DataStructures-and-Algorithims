package InterpolationSearch;

public class Main {
	
	public static void main(String[] args) {
		
		// uniform data
		int[] array = {1,2,3,4,5,6,7,8};
		
		int index = interpolationSearch(array, 5);
		
		if(index != -1) {
			System.out.println("Value found at index: " + index);
		}else {
			System.out.println("Value not found: " + index);
		}
		
		
		// data not uniform
		System.out.println("\ndata not uniform: \n");
		int[] array2 = {1,2,4,8,16,32,64,128,256,512,1024};
		
		int index2 = interpolationSearch(array2, 64);
		
		if(index != -1) {
			System.out.println("Value found at index: " + index2);
		}else {
			System.out.println("Value not found: " + index2);
		}
	}

	private static int interpolationSearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(target >= array[low] && target <= array[high] && low <= high) {
			
			int prob = low + (high - low) * (target - array[low]) 
					/ (array[high] - array[low]);
			System.out.println("Probe: " + prob);
			
			if(array[prob] == target) return prob;
			else if (array[prob] < target) low = prob + 1;
			else high = prob - 1;
		}

		return -1;
		
	}

}

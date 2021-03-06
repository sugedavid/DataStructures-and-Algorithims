package Arrays;

public class Anagram {
	

	    public boolean isAnagram(String s, String t) {
	        
	        // TC: 0(n(log n)
	        // SC: O(n)
	        
	        // create character array 4 the strings
	        char[] sArray = s.toCharArray();
	        char[] tArray = t.toCharArray();
	        
	        // Get lengths of both strings
	        int n1 = sArray.length;
	        int n2 = tArray.length;
	 
	        // If length of both strings is not same,
	        // then they cannot be anagram
	        if (n1 != n2)
	            return false;
	 
	        // Sort both strings
	        mergeSort(sArray);
	        mergeSort(tArray);
	 
	        // Compare sorted strings
	        for (int i = 0; i < n1; i++)
	            if (sArray[i] != tArray[i])
	                return false;
	 
	        return true;
	        
	    }
	    
	    private static void mergeSort(char[] array) {
			
			int length = array.length;
	        
	        //base case
	        if(length <= 1) return;
	            
	        int middle = length / 2;
	        
	        char[] leftArray = new char[middle];
	        char[] rightArray = new char[length - middle];
	        
	        // copy contents of array to l & r array
	        
	        int i = 0;
	        int j = 0;
	        
	        for (; i < length ; i ++){
	            
	            if(i < middle){
	                leftArray[i] = array[i];
	            }else{
	                rightArray[j] = array[i];
	                j++;
	            }
	        }
	        
	        mergeSort(leftArray);
	        mergeSort(rightArray);
	        merge(leftArray, rightArray, array);
			
		}

		private static void merge(char[] leftArray, char[] rightArray, char[] array) {
			
			int leftSize = array.length / 2;
			int rightSize = array.length - leftSize;
			
			int i =0, l=0, r=0;
			
			// check conditions for merging
			while(l < leftSize && r < rightSize) {
				
				if(leftArray[l] < rightArray[r]) {
					array[i] = leftArray[l];
					i++;
					l++;
				}else {
					array[i] = rightArray[r];
					i++;
					r++;
				}
			}
			
			while(l < leftSize) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			while(r < rightSize) {
				array[i] = rightArray[r];
				i++;
				r++;
			}
			
		}
	

}

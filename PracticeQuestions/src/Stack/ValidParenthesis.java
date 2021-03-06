package Stack;
import java.util.*;

public class ValidParenthesis {
	
	public static void main(String[] args) {
		
		
		System.out.println(isValid2("["));
	}
	
	public static boolean isValid2(String s) {
	        
	        // TC: O(n)
	        // SC: O(n)
	        
	        Stack<Character> stack = new Stack<Character>();
	        
	    
	        // loop through char & check if 1st rule is met
	        for(int i = 0; i< s.length() ; i++){
	            char currentCharacter = s.charAt(i);

	             // check if starts with correct char
	             if (currentCharacter == '(' || currentCharacter == '[' ||                                  currentCharacter == '{') {
	                    stack.push(s.charAt(i));
	            }
	            else {
	                    if(stack.isEmpty()) {
	                          return false;
	                    }
	                    char peekChar = stack.peek();
	                    if ((currentCharacter == ')' && peekChar != '(')
	                            || (currentCharacter == '}' && peekChar != '{')
	                            || (currentCharacter == ']' && peekChar != '[')) {
	                        return false;  
	                    } else {
	                        stack.pop();
	                    }
		            }

	        }
	        
	        if(!stack.isEmpty()) {
	            return false;
	        }
        return true; 
	    }
	
		
}

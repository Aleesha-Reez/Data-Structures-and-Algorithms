import java.util.Stack;


public class RemovekDigits {
	
	public static String removeKdigits(String num, int k) {
		
		if(k == num.length())
			return "0";
		
		int i =0;
		
		Stack<Character> st = new Stack<Character>();
		while(i< num.length()){
			while(k >0 && !st.isEmpty() && st.peek() > num.charAt(i)){
				
				st.pop();
				k--;
			}
			st.push(num.charAt(i));
			i++;
		}
		
	    while(k > 0){
			st.pop();
			k--;
		}
	    
	    StringBuilder sb = new StringBuilder();
	    while(!st.isEmpty()){
	    	char current = st.pop();
	    	sb.append(current);
	    }
	    
	    sb.reverse();
	    while(sb.length() > 1 && sb.charAt(0) == '0'){
	    	sb.deleteCharAt(0);
	    }
	    
	    return sb.toString();
	}
	
		
	public static void main(String[] args) {
		
		String num = "10";
		String res = removeKdigits(num,2);
		System.out.println(res);
		
	}    
	}
	
	



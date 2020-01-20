import java.util.ArrayDeque;
import java.util.Queue;


public class BasicCalculator {

	public static int calculate(String s) {

    	Queue<Character> q = new ArrayDeque<Character>();
    	
    	for(char c : s.toCharArray()) {
    		if(c!=' ') {
    			q.offer(c);
    		}
    	}
    	
    	q.offer(' ');
    	return calc(q);   	
    }
    
    
    private static int calc(Queue<Character> q) {
        int num2 = 0, num1 = 0, sum = 0;
        char op1 = '+';
        
        while (!q.isEmpty()) {
            char c = q.poll();
            
            String str = c ==' ' ? "null" : "Not null";
           
            
            
            if (c >= '0' && c <= '9') {
            	
                num2 = num2 * 10 + c - '0';
                
            } else if (c == '(') {
            	
                num2 = calc(q);
                
            } else {
            	
                switch (op1) {
                    case '+':
                        sum += num1;
                        num1 = num2;
                        break;
                        
                    case '-':
                        sum += num1;
                        num1 = -num2;
                        break;
                        
                    case '*':
                        num1 *= num2;
                        break;
                        
                    case '/':
                        num1 /= num2;
                        break;
                }
                if (c == ')') break;
                op1 = c;
                num2 = 0;
            }
        }
        
        return sum + num1;
    }
    
    public static void main(String[] args) {
		
    	String s = "2-1 + 2";
    	int res = calculate(s);
    	System.out.println(res);
	}
}

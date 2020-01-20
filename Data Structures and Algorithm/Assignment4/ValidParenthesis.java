import java.util.Stack;


public class ValidParenthesis<T> {
	
	
	public static void main(String[] args)
    {
        String exp = "(]";
        boolean balanced = isValid(exp);
        System.out.println(balanced);

    }
    
	public static boolean isValid(String str){
    	
    	 
        char[] exp = str.toCharArray();
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0 ; i < exp.length ; i ++){

            if(exp[i] == '{' ||  exp[i] == '(' || exp[i] == '['){
                stack.push(exp[i]);
            }
            if(exp[i] == '}' ||  exp[i] == ')' || exp[i] == ']'){
                
                if(stack.isEmpty())
                    return false;
                char test = stack.pop();
                if(! AreMatching( test, exp[i]))
                    return false;
            }
        }

        return stack.isEmpty() ;
	

}
   public  static boolean AreMatching( char one, char two){
        if(one == '(' && two == ')')
            return true;
        if(one == '{' && two == '}')
            return true;

        if(one == '[' && two == ']')
            return true;
        return false;
    }

}

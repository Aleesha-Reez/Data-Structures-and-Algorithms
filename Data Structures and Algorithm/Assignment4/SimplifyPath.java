
import java.util.Stack;


public class SimplifyPath {
	
	public String simplifyPath(String path) {
		
		String[] s = path.split("/");
		String result="";
		Stack<String> st = new Stack<String>();
		
		for(int i =0;i< s.length;i++){
			
			if( s[i].equals(".")){
				    ;
			}
			else if( s[i].equals(".."))
			{
				if(!st.empty())
					st.pop();
			}
			
			else if(!s[i].equals(""))
					st.push(s[i]);
		}
		
		if(st.empty()){
			 return "/";
		}
		while(!st.empty()){
			
			result = "/"+st.pop()+ result;
		}
		
		return result;
}	
	public static void main(String[] args) {
		
		SimplifyPath s = new SimplifyPath();
		String st = "/home//foo/";
		 String d = s.simplifyPath(st);
		 System.out.println(d);
		
		
	}
		
	}



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;




interface NestedInteger {
	
	

	public List<NestedInteger> getList();
	public Integer getInteger();
	public boolean isInteger();
	

}

class NestedIntegerClass implements NestedInteger {

    boolean isInteger;
    int number = 0;

    List<NestedInteger> list = null;

    NestedIntegerClass(int num) {
        isInteger = true;
        number = num;
    }

    NestedIntegerClass(List<NestedInteger> aList) {
        isInteger = false;
        list = aList;
    }
    @Override
    public boolean isInteger() {
        return isInteger;
    }

    @Override
    public Integer getInteger() {
        return number;
    }

    @Override
    public List<NestedInteger> getList() {
        return list;
    }
}





public class NestedIterator implements Iterator<Integer> {
	
	Queue<Integer> Q ;
	
	public NestedIterator(List<NestedInteger> nestedList) {
		
		 Q = new LinkedList<>();
		 Add(nestedList);
     }
	
	
	private void Add(List<NestedInteger> nestedList){
	
	    for(NestedInteger ni : nestedList)
	    {
	    	if(ni.isInteger()){
	    		
	    	        Q.offer(ni.getInteger());
	         }
	         else{
	        	
	    	         Add(ni.getList());
	         }
	     }
	}
	
	
	@Override
	public Integer next() {
		
		/*if(!Q.isEmpty()){
			Q.poll();
			
		}
		else 
			return -1;*/
		
		return !Q.isEmpty() ? Q.poll() : -1;
	    
	}

	@Override
	public boolean hasNext() {
	    return !Q.isEmpty();
	}
	
	
	public static void main(String[] args) {

        ArrayList<NestedInteger> rootList = new ArrayList<>();

        ArrayList<NestedInteger> list1 = new ArrayList<>();
        list1.add(new NestedIntegerClass(1));
        list1.add(new NestedIntegerClass(1));

        NestedIntegerClass n1 = new NestedIntegerClass(2);

        ArrayList<NestedInteger> list2 = new ArrayList<>();
        list2.add(new NestedIntegerClass(1));
        list2.add(new NestedIntegerClass(1));

        rootList.add(new NestedIntegerClass(list1));
        rootList.add(n1);
        rootList.add(new NestedIntegerClass(list2));

        NestedIterator iterator = new NestedIterator(rootList);
        while (iterator.hasNext()) {

            System.out.print(iterator.next() +",");
        }

       /* rootList = new ArrayList<>();
        n1 = new NestedIntegerClass(1);
        NestedIntegerClass n2 = new NestedIntegerClass(4);
        NestedIntegerClass n3 = new NestedIntegerClass(6);
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list1.add(n3);
        list2.add(n2);
        list2.add(new NestedIntegerClass(list1));
        rootList.add(n1);
        rootList.add(new NestedIntegerClass(list2));

        iterator = new NestedIterator(rootList);
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }*/
    }
}



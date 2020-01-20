
public class MaxStockProfit {

	int maxProfitDifference(int arr[])  
    { 
        int profit = arr[1] - arr[0]; 
         
        for (int i = 0; i < arr.length; i++)  
        { 
            for (int j = i + 1; j < arr.length; j++)  
            { 
                if (profit < arr[j] - arr[i]) 
                    profit = arr[j] - arr[i]; 
            } 
        } 
        return profit; 
    } 
  
   
    public static void main(String[] args)  
    { 
    	MaxStockProfit maxprofit  = new MaxStockProfit (); 
        int arr[] = {7,1,5,3,6,4}; 
        System.out.println("Maximum profit is " +  
                                maxprofit.maxProfitDifference(arr)); 
    } 
} 


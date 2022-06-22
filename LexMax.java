import java.util.Scanner;

class LexMax 
{    
    static void KSwapMaximum(char []arr,  int n, int k) 
    { 
        for (int i = 0;i < n-1; ++i)  
        { 
            if(k<=0) 
                break;
            // Here, indexPositionition  
            // is set where we want to 
            // put the current largest  
            // integer 
            int indexOfMaxPosition = i; 
            for (int j = i + 1; j < n; ++j)  
            { 
      
                // If we exceed the  
                // Max swaps then  
                // break the loop 
                if (k <=0) 
                    break; 
      
                // Find the maximum value  
                // from i+1 to max(k,n)  
                // which will replace  
                // arr[indexPosition] 
                if (arr[j] > arr[indexOfMaxPosition]) 
                    {
                        indexOfMaxPosition = j;
                        k--;
                    } 
            } 
      
            // Swap the elements from  
            // Maximum indexPosition 
            // we found till now to  
            // the ith index 
            for (int j = i; j < indexOfMaxPosition; j++) {
                char temp = arr[j];  
                arr[j]=arr[indexOfMaxPosition];   
                arr[indexOfMaxPosition] = temp;   

            }
            // Updates k after swapping 
            // indexOfMaxPosition-i elements 
        } 
    } 
    public static void main(String args[]) 
    { 
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        String str = s.next();
        char arr[] = str.toCharArray();
        int n = arr.length;  
        s.close();
        KSwapMaximum(arr, n, k); 
      
     
        System.out.print(arr); 
    } 
} 
  
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
public class UniqueDigit {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Dictionary dic = new Hashtable();
        char[] a = (""+s.nextInt()).toCharArray();
        s.close();
        int count=0;
        for (char temp:a)
        {
            if(dic.get(temp)==null)
            {
                dic.put(temp,1);
            }
            else
            {
                dic.put(temp,(int)dic.get(temp)+1);
            }
        }
        for(char temp:a)
        {
            if((int)dic.get(temp)==1)
            {
                count++;
            }
        
        }
        System.out.println(count);
        


    }
    
}


package arraymanipulation;

import java.util.*;

public class Helper {
    
    int n,m;
    int arr[];
    int a,b,k;
    Scanner s=new Scanner(System.in);
    
    void getInp()
    {
      n=s.nextInt();
      m=s.nextInt();
      
      if(!(n>=3 && n<=10000000))
      {
      System.exit(0);
      }
      
      if(!(m>=1 && m<=200000))
      {
      System.exit(0);
      }
      
      arr=new int[n];
      Arrays.fill(arr, 0);
     
    }
    
    void arraymanip()
    {
       for(int i=0;i<m;i++)
       {
         a=s.nextInt();
         b=s.nextInt();
         k=s.nextInt();
         
      if(!(a>=1 && a<=n))
      {
      System.exit(0);
      }
          
      if(!(b>=1 && b<=n && b>=a))
      {
      System.exit(0);
      }
      
       if(!(k>=0 && k<=1000000000))
      {
      System.exit(0);
      }
         
        for(int j=a-1;j<=b-1;j++)
         {
           arr[j]=arr[j]+k;
         }
       
       }
           
    
    }
    
    void findMax()
    {
        int max=arr[0];
      for(int i=0;i<n;i++)
      {
       if(arr[i]>max)
       max=arr[i];
       
      }
      
      System.out.println(max);
    }
            
    
}

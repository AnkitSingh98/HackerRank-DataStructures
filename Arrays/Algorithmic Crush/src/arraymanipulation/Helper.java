
package arraymanipulation;

import java.util.*;

public class Helper {
    
    int n,m;
    long arr[];
    int a,b,k;
    Scanner s=new Scanner(System.in);
    
    void getInp()
    {
      n=s.nextInt();
      m=s.nextInt();
      
      if(!(n>=3 && n<=10000000))
      {
          System.out.println("Enter the correct value");
          System.exit(0);
      }
      
      if(!(m>=1 && m<=200000))
      {
          System.out.println("Enter the correct value");
          System.exit(0);
      }
      
      arr=new long[n];
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
          System.out.println("Enter the correct value");
          System.exit(0);
      }
          
      if(!(b>=1 && b<=n && b>=a))
      {
          System.out.println("Enter the correct value");
          System.exit(0);
      }
      
       if(!(k>=0 && k<=1000000000))
      {
          System.out.println("Enter the correct value");
          System.exit(0);
      }
         
       arr[a-1]=arr[a-1]+k;
       if(b<n)
           arr[b]=arr[b]-k;
       
       }
           
    
    }
    
    void findMax()
    {
        long max=arr[0];
        long sum=arr[0];
      for(int i=1;i<n;i++)
      {
          sum=sum+arr[i];
       if(sum>max)
       max=sum;
       
      }
      
      System.out.println(max);
    }
            
    
}


package sparsearray;

import java.util.*;


public class Helper {
    
    int n,q,count=0;
    String [] st;
    String [] qs;
    Scanner s;
    
    void getStrings()
    {
        s=new Scanner(System.in);
       n=s.nextInt();
       
       if(n>=1 && n<=1000)
       {
       
       st=new String[n];
       s.nextLine();
       
       for(int j=0;j<n;j++)
       {  
         st[j]=s.nextLine();
         
         if(!(st[j].length()>=1 && st[j].length()<=20 ))
                 {
                     System.out.println("Enter the correct value ");
                    System.exit(0);
                 }
     
       }
       
       }
       
       else
       {
           
       System.out.println("Enter the correct value ");
       System.exit(0);
       
       }
    
    }
    
    void getQuery()
    {
        System.out.println("Enter a number: ");
        
       q=s.nextInt();
       if(q>=1 && q<=1000)
       {
       
       qs=new String[q];
   
      s.nextLine();
      for(int i=0;i<q;i++)
      {
          
        qs[i]=s.nextLine();
      }
       }
       
       else
       {
           
       System.out.println("Enter the correct value ");
       System.exit(0);
       
       }
      
    }
    
    void printAns()
    {
       for(int i=0;i<q;i++)
       {
           for(int j=0;j<n;j++)
           {
         if(qs[i].compareTo(st[j])==0)
         {
         count++ ;
         }
             
             }
           
           System.out.println(count);
           count=0;
       }
    }
    
}

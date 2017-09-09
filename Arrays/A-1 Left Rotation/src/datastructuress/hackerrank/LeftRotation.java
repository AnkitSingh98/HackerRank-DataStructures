
package datastructuress.hackerrank;

import java.util.Scanner;
import java.io.*;

public class LeftRotation {
    
     
        int n;
        int d;
       int arr[];
       Scanner s=new Scanner(System.in);
       
        void getArray()
        {
            
              n=s.nextInt();
              d=s.nextInt();
              
              if(d>n)
              {
                  System.out.println("Enter the correct value");
              System.exit(0);
              }
              
              arr=new int[n];
        
        if(n>=1 && n<=100000)
        {
          for(int i=0;i<n;i++)
          {
              
              arr[i]=s.nextInt(); 
          if(arr[i]<1 || arr[i]>1000000)
          {
              System.out.println("Enter the correct value");
              System.exit(0);
          }
          
          }
        }
        
        else 
        {
        System.out.println("Enter valid Range of array size: ");
        }
        
        }
        
        //End of getArray()
        
        void LeftRotate()
        {
          
            int temp;
            
           for(int i=0;i<d;i++)
           {
               temp=arr[0];
               for(int j=0;j<n-1;j++)
               {
                  arr[j]=arr[j+1];
                  System.out.println("a");
               }
               arr[n-1]=temp;
                System.out.println("b");
           }
            
        }
        
        void printArray()
        {
          for(int i=0;i<n;i++)
              System.out.print(" "+arr[i]);
        }
    
}

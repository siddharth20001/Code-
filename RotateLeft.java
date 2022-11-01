// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Test {
    public static void main(String[] args) {
       int a[]={1,45,67,23,4,7,8};
       int d=3,num=0;
       while(d-->0)
       {
           num=a[0];
           for(int i=0;i<a.length-1;i++)
           {
               a[i]=a[i+1];
           }
           a[a.length-1]=num;
       }
       
       for(int i=0;i<a.length;i++)
       {
               System.out.print(" "+a[i]);
        }    
    }
}

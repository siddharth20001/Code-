import java.util.*;
class Test {
    public static void main(String[] args) {
       int a[]={1,45,67,23,4,7,8};
       int d=3,num=0;
       while(d-->0)
       {
           num=a[a.length-1];
           for(int i=a.length-1;i>0;i--)
           {
               a[i]=a[i-1];
           }
           a[0]=num;
       }
       for(int i=0;i<a.length;i++)
       {
               System.out.print(" "+a[i]);
        }
    }
}

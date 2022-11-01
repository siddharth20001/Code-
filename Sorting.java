import java.util.*;
class Test {
    public static void main(String[] args) {
       int a[]={1,45,67,23,4,7,8};
       for(int i=0;i<a.length;i++)
       {
           int temp=0;
           for(int j=0;j<a.length;j++)
           {
               if(a[i]<a[j])
               {
                   temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
               }
           }
       }
       
       for(int i=0;i<a.length;i++)
       {
           System.out.print(" "+a[i]);
       }
    }
}

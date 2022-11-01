import java.util.*;
class Test {
    public static void main(String[] args) {
       int a[]={1,45,67,23,4,7,8};
       int key=8,l=0,h=a.length-1,mid=0,n=0;
       Arrays.sort(a);
       while(l<=h)
       {
           mid=(l+h)/2;
           if(a[mid]==key)
           {
               n=mid;
               break;
           }
           
           if(a[mid]<key)
           {
               l=mid+1;
           }
           
           if(a[mid]>key)
           {
               h=mid-1;
           }
           
       }
       System.out.println("Element found at "+n);
       
    }
}

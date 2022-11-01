import java.util.*;
class Test {
    public static void main(String[] args) {
       int n=153,sum=0,rem=0;
       int temp=n,count=0;
       while(temp>0)
       {
           temp/=10;
           count++;
       }
       int a=n;
       while(n>0)
       {
           rem=n%10;
           sum+=Math.pow(rem,count);
           n/=10;
       }
       if(sum==a)
       {
           System.out.println("Armstrong");
       }else{
           System.out.println("Not");
       }
    }
}

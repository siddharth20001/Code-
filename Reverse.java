import java.util.*;
class Test {
    public static void main(String[] args) {
       int n=12345,sum=0,rem=0;
       int temp=n;
       while(n>0)
       {
           rem=n%10;
           sum=(sum*10)+rem;
           n/=10;
       }
       System.out.println(sum);
    }
}

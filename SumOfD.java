import java.util.*;
class Test {
    public static void main(String[] args) {
       int n=12345,sum=0,rem=0;
       while(n>0)
       {
           rem=n%10;
           sum+=rem;
           n/=10;
       }
       System.out.println(sum);
    }
}

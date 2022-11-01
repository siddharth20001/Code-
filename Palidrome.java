import java.util.*;
class Test {
    public static void main(String[] args) {
       int n=545,sum=0,rem=0;
       int temp=n;
       while(n>0)
       {
           rem=n%10;
           sum=(sum*10)+rem;
           n/=10;
       }
       if(sum==temp)
       {
           System.out.println("Palindrome");
       }else{
           System.out.println("not");
       }
    }
}

class Test {
    public static void main(String[] args) {
       int a[]={1,45,67,23,4,7,8};
       int key=67,n=0;
       for(int i=0;i<a.length;i++)
       {
           if(key==a[i])
           {
               n=i;
               break;
           }
       }
       System.out.println("Element found at "+n);
       
    }
}

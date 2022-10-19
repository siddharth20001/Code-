class Solution {
    public void rotate(int[] a, int k) {
        int n[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            n[(i+k)%a.length]=a[i];
        }
        for(int i=0;i<a.length;i++){
            a[i]=n[i];
        }
    }
}

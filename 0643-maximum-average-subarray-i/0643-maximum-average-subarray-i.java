class Solution {
    public double findMaxAverage(int[] a, int k) {
        int sum=0;
        for(int i=0;i<k;i++) sum+=a[i];
        int max=sum;
        int start =0;
        int end=k;

        while(end<a.length){

            sum-= a[start];
            start++;

            sum+= a[end];
            end++;

            max=Math.max(max,sum);
            
        }
        return (double) max/k;
    }
}
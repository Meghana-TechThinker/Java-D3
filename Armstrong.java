class Count{
    public static void main(String[] args){
        int count=0;
        int n=153;
        int t=n;
        while (n!=0){
            int r=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
        while (t!=0){
            int rem=t%10;
            rem=rem**count;
            
        }
    }
}
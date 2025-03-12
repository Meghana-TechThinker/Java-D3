class SumOfEven{
    public static void main(String[] args){
        int sum=0;
        int n=123467;
        while (n!=0){
            int r=n%10;
            if (r%2==0){
                sum=sum+r;
            }
            n=n/10;
        }
        System.out.println(sum);
    }
}
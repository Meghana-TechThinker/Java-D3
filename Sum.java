class Sum{
    public static void main(String[] args){
        int sum=0;
        int n=6;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
class Count{
    public static void main(String[] args){
        int count=0;
        int n=123467;
        while (n!=0){
            int r=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
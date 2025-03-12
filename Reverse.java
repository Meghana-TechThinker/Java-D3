class Reverse{
    public static void main(String[] args){
        int res=0;
        int a=123;
        while (a>0){
            int r=a%10;
            res=res*10+r;
            a=a/10;
        }
        System.out.println(res);
    }
}
import java.util.*;                          //Counting consecutive 1's and finding max----->{1,1,3,1,1,1}-->o/p=max:3
class Consecutive{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.print("Array elements");
        //int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int c=0;
        int max=0;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            if (arr[i]==1){
                c++;
            } else{
                c=0;
            }
            max=Math.max(max,c);
        }
        System.out.println("count:"+c);
        System.out.println("MAximum: "+max);
    }
}

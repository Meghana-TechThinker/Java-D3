import java.util.*;                               //Moving zero's to the end by using another empty array
class MoveZero{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.print("Array elements");
        //int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int brr[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            //System.out.print(arr[i]+" ");
            if(arr[i]!=0){
                brr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
           brr[j]=0;
        }
        System.out.println(Arrays.toString(brr));
    }
}

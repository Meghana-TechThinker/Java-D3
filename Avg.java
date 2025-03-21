import java.util.*;
class Avg{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size");
        int n=obj.nextInt();
        int sum=0;
        int avg=0;
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        /*System.out.println("printing");
        for(int i=0;i<n/2;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("sum of numbers:"+sum);
        avg=sum/n;
        System.out.println("average of numbers:"+avg);*/
        
        //printing even index numbers
        /*System.out.println("printing");
        for(int i=0;i<n;i++){
            if (i%2==0){
                System.out.println(i+"-"+arr[i]);
            }
            
        }*/
        
        
    //Rotating last element to first  1 2 3 4 5------->5 1 2 3 4
    import java.util.*;
    class Empty{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int temp=0;
        System.out.println("printing");
        int[] brr=new int[n];
        temp=arr[n-1];
        int i=0;
        for(int j=1;j<n;j++){
            brr[j]=arr[i];
            i++;
        }
        brr[0]=temp;
        System.out.print(Arrays.toString(brr));
    }
}


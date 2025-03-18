import java.util.*;
class Smax{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.print("Array elements");
        //int sum=0;
        /*int max=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int smax=0;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            if(max<arr[i]){
                smax=max;
                max=arr[i];
                
            }
            
        }
        System.out.println("MAx element: "+max);
        System.out.println("second MAx element: "+smax);*/
        
        
        int min=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int smin=min=arr[0];
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]<min){
                smin=min;
                min=arr[i];
                
            }
            
        }
        System.out.println("Min element: "+min);
        System.out.println("second Min element: "+smin);


    }
}
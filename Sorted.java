import java.util.*;
class Sorted{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.print("Array elements");
        //int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int c=0;                                       /*boolean flag=treue;
        for(int i=0;i<n-1;i++){                          for(int i=0;i<n-1;i++){                          
            if(arr[i]<=arr[i+1]){                           if(arr[i]>=arr[i+1]){
                c++;                                                //flag=false;
            }                                                       //break;
        }                                                      }
        if(c==n-1){                                         }      
            System.out.print("Sorted");                     if (flag){
        } else{                                                 print sorted
            System.out.print("Not sorted");                else not soretd*/
        }
            
    }
}


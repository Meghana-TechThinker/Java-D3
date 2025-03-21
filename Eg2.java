import java.util.*;                                                   //Adding  each row elements in a matrix and find index of row which had highest sum value.
class Eg2{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Array size");
        //int n=obj.nextInt();
        int r=obj.nextInt();
        int c=obj.nextInt();
        System.out.println("Eneter mat1 values:");
        int arr[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        int max=0,sum,temp=0;
        for (int i=0;i<r;i++){
            sum=0;
            for (int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
            if(sum>max){
                temp=i;
                max=sum;
            }

        } 
           System.out.println("index:"+temp);
    }
}

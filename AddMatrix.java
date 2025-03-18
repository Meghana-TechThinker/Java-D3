import java.util.*;
class AddMatrix{
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
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Eneter mat2 values:");
        int crr[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                crr[i][j]=obj.nextInt();
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(crr[i][j]);
            }
        }
        System.out.println("Addition of matrices");
        int add[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                add[i][j]=arr[i][j]+crr[i][j];
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}
        
        

import java.util.*;
class Patterns{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ((i==j)||(i+j==n+1)||(i+j==j+1)||(i+j==n+j)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        //Inverted right angle triangle
        /*for(int i=1;i<n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();*/

        //right angle triangle
        /*for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();*/
        }
    }
}
import java.util.*;
class For{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i); 
            }
        }
    }
}
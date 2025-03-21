import java.util.*;
public class Empty {
        public static void main(String[] args){
            int count=0;
            int n=153;
            int t=n;
            while (n!=0){
                int r=n%10;
                count++;
                n=n/10;
            }
            System.out.println(count);
            int s=0,rem;
            n=t;
            while (n!=0){
                rem=n%10;
                s=s+(int)Math.pow(rem,count);
                n=n/10;  
            }
            System.out.print(s);
            if(s==t){
                System.out.println("Armstrong");
            }
            else{
                System.out.println(" Not Armstrong");
            }
        }
}

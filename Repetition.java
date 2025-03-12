/*import java.io.*;
class Repetition{
    public static void main(String[] args){
        int a=5,i=1;
        while (i<=a){
            System.out.println(i);
            i++;
        }
    }

} */
import java.io.*;
class Repetition{
    public static void main(String[] args){
        int a=5,i=1;
        do{
            if(i%2==0){
                System.out.println(i);
                i++;
            }
        }while(i<=a);
    }
}
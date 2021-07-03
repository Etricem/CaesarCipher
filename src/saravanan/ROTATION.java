package saravanan;
import java.util.Scanner;
public class ROTATION {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        for(int g=0;g<n;g=g+2){
           int sara=a[n-1];
           for(int i=n-1;i>g;i--)a[i]=a[i-1];
           a[g]=sara;
           
            
        }
        for(int i=0;i<n;i++) System.out.print(a[i]+ " ");
                   
       }
    }


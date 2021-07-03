package saravanan;
import java.util.Scanner;
public class maxmincombo {
   public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the array length:");
       int len=s.nextInt();
       int[]A;
       A=new int[len];
       System.out.print("Enter the array:");
       for(int i=0;i<len;i++) A[i]=s.nextInt();
       for(int i=0;i<len;i++){
           int min=A[i],index=i;
           for(int j=i+1;j<len;j++){
               if(A[j]<min){
                   min=A[j];
                   index=j;
               }
            }
           int sara=A[i];
           A[i]=min;
           A[index]=sara;
       }
       for(int g=0;g<len;g=g+2){
           int sara=A[len-1];
           for(int i=len-1;i>g;i--)A[i]=A[i-1];
           A[g]=sara;
       }
       for(int i=0;i<len;i++) System.out.print(A[i]+" ");     
   }
}

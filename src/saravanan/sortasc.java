package saravanan;
import java.util.Scanner;
public class sortasc {
 public static void main(String args[]) {
     System.out.print("sortasc");
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int A[];
     A=new int[n];
     for(int i=0;i<n;i++) A[i]=s.nextInt();
     for(int i=0;i<n;i++){
         int min=A[i],index=i;
         for(int j=i+1;j<n;j++){
             if(A[j]<min){
                 min=A[j];
                 index=j;    
             }
         }   
         int sar=A[i];
             A[i]=min;
             A[index]=sar;
     }
     for(int i=0;i<n;i++) System.out.print(A[i]+" ");     
        
    }
}

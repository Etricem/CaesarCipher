package saravanan;
import java.util.Scanner;
public class Saravanan {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a=n;
        int[]A=new int[a];
        for(int i=0;i<n;i++) A[i]=s.nextInt();
        int rot=s.nextInt();
        for(int g=0;g<rot;g++){
          int k=A[0];
          for(int i=0;i<n-1;i++) A[i]=A[i+1];
          A[n-1]=k;
        }
          for(int j=0;j<n;j++) System.out.print(A[j]+ " ");
        
     }
     
     
      }
        
        



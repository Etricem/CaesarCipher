package saravanan;
import java.util.Scanner;
public class sickmaxmin {
    Scanner s=new Scanner(System.in);
    int[]rotate(int[]D,int n){
        for(int g=0;g<1;g++){
            int sar=D[n-1];
            for(int i=n-1;i>0;i--){
                D[i-1]=D[i];
            }
            D[0]=sar;
            for(int i=0;i<n;i++) System.out.print(D[i]);
        }
        return D;
    }          
  public static void main(String args[]) {
    sickmaxmin q =new sickmaxmin();
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int A[]=new int[n];
    for(int i=0;i<n;i++)  A[i]=s.nextInt();
    int k=0;
    int D[]=new int[n];
    for(int i=0;i<n;i++){
      int max=i,index=i;
      for(int j=i+1;j<n;j++){
        if(max>=A[j]){
            max=A[j];
            index=j;
          }
      }
      D[k]=max;
      k++;
      A[index]=-1;
      }
    for(int i=0;i<n;i++) System.out.print(D[i]);
    int[]C=new int[n];
    for(int i=0;i<n;i=i+2){
    C=q.rotate(D,4);
    }
    for(int i=0;i<n;i++) System.out.print(C[i]);  
  }
}
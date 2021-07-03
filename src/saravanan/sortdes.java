package saravanan;
import java.util.Scanner;
public class sortdes {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the array length:");
        int len=s.nextInt();
        int[]A;
        A=new int[len];
        System.out.print("Enter the array:");
        for(int i=0;i<len;i++) A[i]=s.nextInt();
        for(int i=0;i<len;i++){
            int max=A[i],index=i;
            for(int j=i+1;j<len;j++){
                if(A[j]>max){
                    max=A[j];
                    index=j;
                }
            }
            int temp=A[i];
                A[i]=max;
                A[index]=temp;
        }
        System.out.print("Array in descending order:");
        for(int i=0;i<len;i++) System.out.print(A[i]+" ");
    }
}

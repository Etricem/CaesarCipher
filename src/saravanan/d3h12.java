package saravanan;
import java.util.Scanner;
import java.lang.String;
public class d3h12 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int len=a.length();
        int n=0;
        char[]b=new char[len];
        b=a.toCharArray();
        for(int i=0;i<len;i++){
            int x=(int)b[i];
            if(x>57){
                char c=b[i];
                for(int j=i+1;j<len&&(int)b[j]<58;j++)n=(n*10)+(int)b[j]-48;
                for(int j=0;j<n;j++) System.out.print(c);
                n=0;
                        }
                }
    }
    
}



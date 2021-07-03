package saravanan;
import java.util.Scanner;
import java.lang.String;
public class CaesarCipher {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        int n=A.length();
        int key=s.nextInt();
        char[]b;
        b=A.toCharArray();
        for(int i=0;i<n;i++){
            int sar=(int)b[i];
            if(sar>=65&&sar<=90){
                  int x=sar+key;
                  if(x>90)
                      x=x-26;
                      char SRI=(char)x;
                      System.out.print(SRI);
        }
            if(sar>=97&&sar<=122){
                int x=sar+key;
                if(x>122) x=x-26;
                char SRI=(char)x;
                System.out.print(SRI);
            }
            
                           
      }
 }
}
                            
    
  




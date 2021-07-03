package saravanan;
import java.util.Scanner;
import java.lang.String;
public class StandardCaeasarCipher {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int len=a.length();
        int key=s.nextInt();
        char[]b;
        b=a.toCharArray();
        for(int i=0;i<len;i++){
            int sar=(int)b[i];
            if(sar>=65&&sar<=90){
                int x=sar+key;
                x=(((x-65)%26)+65);
                char SAR=(char)x;
                System.out.print(SAR);    
            } 
            if(sar>=97&&sar<=122){
                 int x=sar+key;
                 x=(((x-97)%26)+97);
                 char SAR=(char)x;
                 System.out.print(SAR);           
            }      
        }
    }
}


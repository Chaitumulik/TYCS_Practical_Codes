import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

class P9 {
    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
            String s;
            System.out.println("Please Enter a String:");
            s=sc.nextLine();
            KeyGenerator keygen=KeyGenerator.getInstance("DES");
            SecretKey sk=keygen.generateKey();
            Cipher cip=Cipher.getInstance("DES");
            cip.init(Cipher.ENCRYPT_MODE, sk);
            byte[] encrypted=cip.doFinal(s.getBytes());
            cip.init(Cipher.DECRYPT_MODE, sk);
            byte[] decrypted=cip.doFinal(encrypted);
            System.out.println("Encrypted="+new String(encrypted));
            System.out.println("Decrypted="+new String(decrypted));
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}

/**
OUTPUT:

D:\504 pracs>java P9
Please Enter a String:
fdbfdjhtyj
Encrypted=Y�+aq?SZ?e ?8|+�
Decrypted=fdbfdjhtyj

D:\504 pracs>javac p9.java

D:\504 pracs>java P9
Please Enter a String:
hello
Encrypted=a-�>�+�?
Decrypted=hello
*/
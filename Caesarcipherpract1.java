/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caesarcipherpract1;

import java.util.Scanner;

/**
 *
 * @author Chaitu
 */
public class Caesarcipherpract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message,encryptedmessage="";
        int key;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a message:");
        message=sc.nextLine();
        
        System.out.println("Enter Key:");
        key=sc.nextInt();
        for (int i=0;i<message.length();i++)
        {
            ch=message.charAt(i);
            
            if(ch>='a'&&ch<='z')
            {
                ch=(char)(ch+key);
                if(ch>'z'){ch=(char)(ch-'z'+'a'-1);}
                encryptedmessage+=ch;
            }
            else if(ch>='A'&&ch<='z')
            {
                ch=(char)(ch+key);
                if(ch>'z'){ch=(char)(ch-'z'+'A'-1);}
                encryptedmessage+=ch;
            }
            else {encryptedmessage+=ch;}
        }
        System.out.println("Encrypted Message: "+encryptedmessage);
    }
    
}

Output:

run:
Enter a message:
Hello
Enter Key:
2
Encrypted Message: Jgnnq
BUILD SUCCESSFUL (total time: 6 seconds)


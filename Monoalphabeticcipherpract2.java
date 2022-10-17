/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monoalphabeticcipherpract2;

import java.util.Scanner;

/**
 *
 * @author Chaitu
 */
public class Monoalphabeticcipherpract2 {
    public static char p[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
public static char ch[]={'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
public static String doEncryption(String s)
{
char c[]=new char[(s.length())];
for(int i=0;i<s.length();i++)
{
for(int j=0;j<26;j++)
{
if(p[j]==s.charAt(i))
{
c[i]=ch[j];
break;
}
}
}
return(new String(c));
}
public static String doDecryption(String s)
{
char p1[]=new char[(s.length())];
for(int i=0;i<s.length();i++)
{
for(int j=0;j<26;j++)
{
if(ch[j]==s.charAt(i))
{
p1[i]=p[j];
break;
}
}
}
return(new String(p1));
}

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter a Message: ");
                String en=doEncryption(sc.next().toLowerCase());
                System.out.println("Encrypted Message: "+en);
                System.out.println("Decrypted Message: "+doDecryption(en));
        }
    }
    
}

Output:
run:
Enter a Message: 
Vikas
Encrypted Message: COAQL
Decrypted Message: vikas
BUILD SUCCESSFUL (total time: 5 seconds)

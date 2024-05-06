package HackerRank;
import java.io.*;
import java.util.*;
import java.security.*;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;
public class SHA {
   


    
    public static String sha256(String input){
        try{
        MessageDigest md=MessageDigest.getInstance("SHA-256");
        byte[] hash=md.digest(input.getBytes(StandardCharsets.UTF_8));
        BigInteger no=new BigInteger(1,hash);
        StringBuilder hex=new StringBuilder(no.toString(16));
        while(hex.length()<64)
        {
            hex.insert(0,"0");
        }
        return hex.toString();
    }
     catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter :");
        String input=sc.nextLine();
        System.out.println(sha256(input));
        
    }
}
    


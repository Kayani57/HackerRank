package HackerRank;

import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.*;




class Solution {
    
    public static String md5(String input) {
           try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashText = no.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input: ");
        String input=sc.nextLine();
        
        System.out.println(md5(input));
        sc.close();
        
    }}

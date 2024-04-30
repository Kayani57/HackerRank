package HackerRank;

import java.io.*;
import java.util.*;

import java.lang.reflect.*;
import static java.lang.System.in;

class Prime{
    void checkPrime(int... args)
    {
        boolean check=false;
       
        for(int i=0;i<args.length;i++)
        {
             int n=args[i];
          if(n<=1)
          {
            check=false;  
          }
          for (i = 2; i <= n/2; ++i) {
    if (n % i == 0) {
      check = false;
      break;
    }
          }  
          if(check){
              System.out.println(n);
          } 
          if(!check){System.out.println();}
          
    }
    }
}
class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}



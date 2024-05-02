package HackerRank;

import java.util.Scanner;

class Singleton{
    public static String str;
    public static Singleton instance;
    private Singleton(){}
public static Singleton getSingleInstance(){
    if(instance==null)
    {
        instance=new Singleton();
    }
    return instance;
}
}
 class Main {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getSingleInstance();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter message");
        // Set the str variable
        singleton.str = sc.nextLine();
        
        // Output
        System.out.println("Hello I am a singleton! Let me say " + singleton.str + " to you");
    }
}


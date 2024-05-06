package HackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;

class Prime {
    void checkPrime(int... args) {
        for (int n : args) {
            boolean check = true; // Assume it's prime initially

            if (n <= 1) {
                check = false;
            }

            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    check = false; // Not prime
                    break;
                }
            }

            if (check) {
                System.out.print(n + " ");
            }
        }
        System.out.println(); // Print newline after each set of primes
    }
}

class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (Method method : methods) {
                if (!set.add(method.getName())) {
                    overload = true;
                    break;
                }
            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


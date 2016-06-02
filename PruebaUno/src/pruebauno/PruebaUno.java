/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebauno;

import java.util.*;

/**
 *
 * @author arturogarzajacinto
 */
public class PruebaUno {

    public static String RemoveCharacters(String s1, String s2) {
        String result = "";
        int lenS1 = s1.length(), lenS2 = s2.length();
        for (int i = 0; i < lenS1; i++) {
            boolean test = false;
            char currentS1 = s1.charAt(i);
            for (int j = 0; j < lenS2; j++) {
                char currentS2 = s2.charAt(j);
                test = test | (currentS1 - currentS2 == 0);
            }
            if (test == false) {
                result += currentS1;
            }
        }

        return result;
    }

    public static String RemoveCharacter(String s1, String s2) {
        String result = "";
        int lenS1 = s1.length(), lenS2 = s2.length();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < lenS2; i++) {
            if (hm.containsKey(s2.charAt(i))) {
                hm.put(s2.charAt(i), hm.get(s2.charAt(i)) + 1);
            } else {
                hm.put(s2.charAt(i), 1);
            }
        }
        for (int i = 0; i < lenS1; i++) {
            char currentS1 = s1.charAt(i);
            if (!hm.containsKey(currentS1)) {
                result += currentS1;
            }
        }

        return result;
    }

    public static int BinaryMultipleOf3(String in) {
        char[] arr = in.toCharArray();
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];
            if (current - '1' == 0) {
                if (i % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }
        if (Math.abs(countOdd - countEven) % 3 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int CountNumberOfHopsR(int hopsToTop){
        if(hopsToTop==0){
            return 1;
        }else if(hopsToTop<0){
            return 0;
        }else{
            return CountNumberOfHopsR(hopsToTop-1)+CountNumberOfHopsR(hopsToTop-2)+CountNumberOfHopsR(hopsToTop-3);
        }
    }

    public static int CountNumberOfHops(int hopsToTop) {
         int solutions=0;
        Stack <Integer> st = new Stack<Integer>();
        if(hopsToTop==1){
            return 1;
        }
        st.push(hopsToTop-3);
        st.push(hopsToTop-2);
        st.push(hopsToTop-1);
        while(!st.empty()){
            int cur=st.pop();
            if(cur>0){
                st.push(cur-1); 
                st.push(cur-2); 
                st.push(cur-3); 
            }else if(cur==0){
                solutions++;
            }
        }   
        return solutions;
   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //Test for RemoveCharacters
        /*if(T<15 && T>0){
            while(T>0){
                String s1 = sc.next(), s2=sc.next();
                if(s1.length()<50 && s2.length()<50 && s1.length()>0 && s2.length()>0){
                    String res= RemoveCharacter(s1,s2);
                    System.out.println(res);
                    T--;
                }
            }
        }*/
        //Test for Binary Number Multiple of 3
        /*if(T<=100 && T>=1){
            while(T>0){
                String in = sc.next();
                System.out.println(BinaryMultipleOf3(in));
                T--;
            }
        }*/
        if (T <= 50 && T >= 1) {
            while (T > 0) {
                int in = sc.nextInt();
                System.out.println(CountNumberOfHops(in));
                T--;
            }
        }

    }

}

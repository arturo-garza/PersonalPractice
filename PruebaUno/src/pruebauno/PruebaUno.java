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
    
    public static String RemoveCharacters(String s1, String s2){
        String result ="";
        int lenS1=s1.length(), lenS2=s2.length();
        for(int i=0;i<lenS1;i++){
            boolean test = false;
            char currentS1= s1.charAt(i);
            for(int j=0;j<lenS2;j++){
                    char currentS2 = s2.charAt(j);
                    test=test|(currentS1-currentS2==0);
            }
            if(test==false){
                result+=currentS1;
            }
        }
        
        return result;
    }
    
    public static int BinaryMultipleOf3(String in){
        char [] arr = in.toCharArray();
        int countOdd =0;
        int countEven=0;
        for(int i =0;i<arr.length;i++){
            char current = arr[i];
            if(current - '1'==0){
                if(i%2==0){
                    countEven++;
                }else{
                    countOdd++;
                }
            } 
        }
        if(Math.abs(countOdd-countEven)%3==0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //Test for RemoveCharacters
        /*if(T<15 && T>0){
            while(T>0){
                String s1 = sc.next(), s2=sc.next();
                if(s1.length()<50 && s2.length()<50 && s1.length()>0 && s2.length()>0){
                    String res= RemoveCharacters(s1,s2);
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
    }
    
}

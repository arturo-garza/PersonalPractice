/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

/**
 *
 * @author arturogarzajacinto
 */
public class Prueba2 {
    
    public static int SecondLargerNumber(int [] array){
        int numMax = 0,numNextMax = 0;
        if(array.length<2){
            System.out.println("There can be no second max as the length of the array is " +array.length);
        }else{
            if(array[0]>array[1]){
                numMax = array[0];
                numNextMax = array[1];
            }else{
                numMax = array[1];
                numNextMax = array[0];
                    
                for(int a =2;a<array.length;a++){
                    if(array[a]>numMax){
                            numNextMax=numMax;
                            numMax=array[a];
                    }else if(array[a]<numMax && array[a]> numNextMax){
                        numNextMax=array[a];
                    }
                }
                
                return numNextMax;
            }

        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] ar = {1,8,3,6,2};
        System.out.println("Largest number in " +SecondLargerNumber(ar));
    }
    
}

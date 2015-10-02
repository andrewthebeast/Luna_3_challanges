/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luna_3_challenge0;

/**
 *
 * @author andrewthebeast
 */
public class Luna_3_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 501 ;i++){
        if (isDivisible11(i) && isDivisible5(i)){
            System.out.println("Animate This!");
            
    } else if(isDivisible11(i) && isDivisible3(i)){
            System.out.println("Herr Direktor");
            
    } else if(isDivisible11(i) && isDivisible2(i)){
            System.out.println("ninja");
            
    }else if(isDivisible3(i) && isDivisible5(i) && isDivisible5(i)){
            System.out.println("Team Building");
            
    }else if(isDivisible2(i) && isDivisible3(i)){
            System.out.println("chismé");
            
    }else if(isDivisible2(i)){
            System.out.println("Davis");
            
    }else if(isDivisible3(i)){
            System.out.println("Claughton");
    
    }else if(isDivisible5(i)){
            System.out.println("Vidal");
    
    } else {
        System.out.println(i);
    }
    }
    }
    static boolean isDivisible2(int number) {
            return (number % 2 == 0);
            
    }
    static boolean isDivisible3(int number) {
            return (number % 3 == 0);
    
    }
    static boolean isDivisible5(int number) {
            return (number % 5 == 0);
            
    }
    static boolean isDivisible11(int number) {
            return (number % 11 == 0);
            
    }
    
    
}

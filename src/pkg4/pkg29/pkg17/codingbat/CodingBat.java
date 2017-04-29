/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg29.pkg17.codingbat;

/**
 *
 * @author user
 */
public class CodingBat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CodingBatHelper codingbathelper = new CodingBatHelper();
        
        /*
            --- Exercise: "Warmup-1 sleepIn" ---
            The parameter weekday is true if it is a weekday, and the 
            parameter vacation is true if we are on vacation. We sleep 
            in if it is not a weekday or we're on vacation. Return true 
            if we sleep in.
            
            Values to be returned:
            sleepIn(false, false) → true
            sleepIn(true, false) → false
            sleepIn(false, true) → true
        */
        
        System.out.println("*** Exercise: Warmup-1 > sleepIn ***");        
        System.out.println(codingbathelper.sleepIn(false, false));
        System.out.println(codingbathelper.sleepIn(true, false));
        System.out.println(codingbathelper.sleepIn(false, true));
        
        //-----------------------------------------        
        /*
            --- Exercise: "Warmup-1 > monkeyTrouble " ---            
            We have two monkeys, a and b, and the parameters aSmile and bSmile 
            indicate if each is smiling. We are in trouble if they are both 
            smiling or if neither of them is smiling. Return true if we are in 
            trouble.
        
            Values to be returned:
            monkeyTrouble(true, true) → true
            monkeyTrouble(false, false) → true
            monkeyTrouble(true, false) → false
        */
        
        System.out.println("*** Exercise: Warmup-1 > monkeyTrouble ***");        
        System.out.println(codingbathelper.monkeyTrouble(true, true));
        System.out.println(codingbathelper.monkeyTrouble(false, false));
        System.out.println(codingbathelper.monkeyTrouble(true, false));
        
        //-----------------------------------------        
        /*
            --- Exercise: "Warmup-1 > sumDouble" ---   
            Given two int values, return their sum. Unless the two values 
            are the same, then return double their sum.
        
            Values to be returned:
            sumDouble(1, 2) → 3
            sumDouble(3, 2) → 5
            sumDouble(2, 2) → 8
        */
        
        System.out.println("*** Exercise: Warmup-1 > sumDouble ***");        
        System.out.println(codingbathelper.sumDouble(1, 2));
        System.out.println(codingbathelper.sumDouble(3, 2));
        System.out.println(codingbathelper.sumDouble(2, 2));
        
        //-----------------------------------------        
        /*
            --- Exercise: "Warmup-1 > diff21" ---           
            Given an int n, return the absolute difference between n and 21, 
            except return double the absolute difference if n is over 21.

            diff21(19) → 2
            diff21(10) → 11
            diff21(21) → 0
        */
        
        System.out.println("*** Exercise: Warmup-1 > diff21 ***");        
        System.out.println(codingbathelper.diff21(19));
        System.out.println(codingbathelper.diff21(10));
        System.out.println(codingbathelper.diff21(21));
        
        //-----------------------------------------        
        /*
            --- Exercise: "Warmup-1 > parrotTrouble " ---                       
            We have a loud talking parrot. The "hour" parameter is the current 
            hour time in the range 0..23. We are in trouble if the parrot is 
            talking and the hour is before 7 or after 20. Return true if we are 
            in trouble.

            parrotTrouble(true, 6) → true
            parrotTrouble(true, 7) → false
            parrotTrouble(false, 6) → false
        */
        
        System.out.println("*** Exercise: Warmup-1 > parrotTrouble ***");        
        System.out.println(codingbathelper.parrotTrouble(true, 6));
        System.out.println(codingbathelper.parrotTrouble(true, 7));
        System.out.println(codingbathelper.parrotTrouble(false, 6));
        
        //-----------------------------------------        
        /*
            --- Exercise: "Warmup-1 > makes10" ---      
            Given 2 ints, a and b, return true if one if them is 10 or if 
            their sum is 10.
            makes10(9, 10) → true
            makes10(9, 9) → false
            makes10(1, 9) → true
        */
        
        System.out.println("*** Exercise: Warmup-1 > parrotTrouble ***");        
        System.out.println(codingbathelper.makes10(9, 10));
        System.out.println(codingbathelper.makes10(9, 9));
        System.out.println(codingbathelper.makes10(1, 9));
        
        //-----------------------------------------        
        /*
            --- Exercise: "Warmup-1 > nearHundred " ---      
            Given an int n, return true if it is within 10 of 100 or 200. 
            Note: Math.abs(num) computes the absolute value of a number.

            nearHundred(93) → true
            nearHundred(90) → true
            nearHundred(89) → false
        */
        
        System.out.println("*** Exercise: Warmup-1 > nearHundred ***");        
        System.out.println(codingbathelper.nearHundred(93));
        System.out.println(codingbathelper.nearHundred(90));
        System.out.println(codingbathelper.nearHundred(89));
        
    }
    
}

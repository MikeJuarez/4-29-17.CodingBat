/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg29.pkg17.codingbat;

/**
 *
 * @author Michael Juarez
 */

public class CodingBatHelper {
    
    public CodingBatHelper(){} 
    
    public boolean sleepIn(boolean weekday, boolean vacation)
    {
        return (!weekday | vacation);
    }
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) 
    {        
        return (aSmile == bSmile);
    }
    
    public int sumDouble(int a, int b) {        
        if (a==b)
            return (a+b)*2;
        
        return a+b;       
    }
    
    public int diff21(int n) {        
        if (n > 21)
            return Math.abs((n-21)*2);
        return Math.abs(n-21);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));                            
    }
    
    public boolean makes10(int a, int b) {
        return ((a == 10 || b == 10) || a+b == 10);
    }

    public boolean nearHundred(int n) { 
        return (Math.abs(100-n) <= 10 || Math.abs((200-n)) <= 10);           
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex.phone;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
/**
 *
 * @author jpiasecki
 */
public class REGEXPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pattern PhoneNumber;
        
        PhoneNumber = Pattern.compile("([(]{0,})([0-9]{3})([)]{0,}[ ]{0,}[-]{0,}[.]{0,})([0-9]{3})([-]{0,}[.]{0,})([0-9]{4})");
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter a phone number: ");
        
        String number = sc.nextLine();
        sc.close();
        
        if(!number.equals(""))
        {
            
            Matcher numberMatch = PhoneNumber.matcher(number);
            
            if(numberMatch.matches())
            {
                String first = numberMatch.group(2);
                String second = numberMatch.group(4);
                String third = numberMatch.group(6);
                System.out.println("The phone number is: " + "(" + first +") "
                + second +"-" +third);
            }
            else
            {
                System.out.println("The number entered is invalid!");
            }
            
         
        }
        else
        {
            System.out.println("Please enter a phone number!");
        }
    }
    
}

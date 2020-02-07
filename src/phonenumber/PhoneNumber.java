/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumber;
import java.util.Scanner;
/**
 *
 * @author ikoal
 */
public class PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    {
        System.out.print("give me 10 numbers: ");
        String phonenum = new Scanner(System.in).next();
        boolean wrong = PNum(phonenum);
        if(wrong){
            System.out.println(phonenum.length()==10&&!phonenum.isEmpty()?
                "("+phonenum.substring(0,3)+")"+" "+phonenum.substring(3,6)+"-"+phonenum.substring(6)+"":
             "");
        }else{
            System.out.println("give me a number");
        }
    }
}
    public static boolean PNum(String numb){
        boolean result;

        try{
            Long.parseLong(numb);
            result=true;
        }catch (NumberFormatException e){
            result=false;
        }

        return result;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yelling;

/**
 *
 * @author Akashdeep Singh
 */
public class Yelling {

    // AS SPECIFIED 
    /*
        You cannot modify the function name or the number of parameters
        All of your code must be put in one scream function.
        Function stub:
            scream(name)
    
    There is only parameter in scream function -> name 
     */
    public String scream(String... name) {
        
        if (name == null) {
            return "Nobody is yelling";
        }
                           
        //============= REQ 1 -  FIRST LETTER IN UPPERCASE ======================//
        boolean isUpperCase = Character.isUpperCase(name[0].charAt(0));
        boolean lowercase2 = Character.isLowerCase(name[0].charAt(1));

        if (isUpperCase == true && lowercase2 == true) {
            return name[0] + " is yelling";
        } //============= REQ 2 -  NAME IS UPPERCASE  ============================//
        else if (name[0].equals(name[0].toUpperCase())) {
            return name[0] + " IS YELLING";
        } //============= REQ 3 -  NO BODY YELLING ============================//
        //============= REQ 4 -  TWO PEOPLE YELLING ============================//
        else if (name[0] != null && name[1] != null && name.length == 2) {
            return name[0] + " and" + name[1] + " are yelling";

        } //============ REQ 5 -  MULTIPLE PEOPLE YELLING ========================//
        else if (name.length > 2 && name.length < 5) {
            int length = name.length;
            String names = "";
            for (int i = 0; i < length; i++) {
                if (i == length - 2) {
                    names = names + " and ";
                }
                names = names + " ," + name[i];

            }
        } //======== REQ 6 - MULTIPLE PEOPLE YELLING WITH NAME UPPERCASE AND LOWERCASE ===========//
//        else if (name.length > 2) {
//            int length = name.length;
//            String names = "";
//            for (int i = 0; i < length; i++) {
//                if (i == length - 2) {
//                    names = names + " and ";
//                }
//                names = names + " ," + name[i];
//
//            }
//        }
//
        return name[0];
    }
}

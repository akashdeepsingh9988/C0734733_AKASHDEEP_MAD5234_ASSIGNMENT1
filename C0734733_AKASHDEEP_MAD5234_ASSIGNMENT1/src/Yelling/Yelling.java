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

    public String scream(String... name) {
        
        //============= REQ 1 -  FIRST LETTER IN UPPERCASE ======================//
        boolean isUpperCase = Character.isUpperCase(name[0].charAt(0));
        boolean lowercase2 = Character.isLowerCase(name[0].charAt(1));
        if (isUpperCase == true && lowercase2 == true) {
            return name[0] + "is yelling";
        }
        //============= REQ 2 -  NAME IS UPPERCASE  ============================//
        else if (name[0].equals(name[0].toUpperCase())) {
            return name[0] + "IS YELLING";
        } 
        //============= REQ 3 -  NO BODY YELLING ============================//
        else if (name[0] == null) {
            return "Nobody is yelling";
        } 
        //============= REQ 4 -  TWO PEOPLE YELLING ============================//
        else if (name[0] != null && name[1] != null) {
            return name[0] + "and" + name[1] + "are yelling";

        }   
        //============ REQ 5 -  MULTIPLE PEOPLE YELLING ========================//
        else if (name.length > 2) {
            int length = name.length;
            String names = "";
            for (int i = 0; i < length; i++) {
                if (i == length - 2) {
                    names = names + " and ";
                }
                names = names + " ," + name[i];

            }
        }

        return name[0];
    }
}

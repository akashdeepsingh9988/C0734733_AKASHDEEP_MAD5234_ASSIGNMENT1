/*
 * STUDENT NAME : AKASHDEEP SINGH
 * STUDENT #ID : C0734733
 */
package Yelling;

import java.util.Arrays;

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
    There is no instruction specified to use particular Data type 
    In this case i am using Varags
     */
    public String scream(String... name) {

        
 //============= REQ 3 -  NO BODY YELLING ============================//
        if (name == null) {
            return "Nobody is yelling";

        }
        
 // ======== REQ 6 - MULTIPLE PEOPLE YELLING WITH NAME UPPERCASE AND LOWERCASE ===========//

        else if (name.length == 4) {
            String names = "";
            for (int i = 0; i < name.length; i++) {
                if (name[i] == name[i].toUpperCase()) {
                    names = "SO IS " + name[i] + ". ";
                } else {
                    names = names + name[i] + ",";
                }

                if (i == name.length - 2) {
                    names = names + " and ";
                }

            }
            names = names + " is yelling";
            names = names.replace(", and ", " and ");
            names = names.replace(", is ", " is ");
            return names;

        }
        
//============ REQ 5 -  MULTIPLE PEOPLE YELLING ========================//
        else if (name.length > 2) {
            int length = name.length;
            String names = "";
            String n = "";
            for (int i = 0; i < length; i++) {

                if (i == 0) {

                    names = name[i];
                } else {
                    names = names + "," + name[i];

                    if (i == name.length - 2) {
                        names = names + " and";
                      }
                }

            }
            names = names.replace(" and,", " and ");
            return names + " are yelling";

        } 

//============= REQ 4 -  TWO PEOPLE YELLING ============================//
        else if (name.length > 1) {
            return name[0] + " and " + name[1] + " are yelling";

        }

        //============= REQ 1 -  FIRST LETTER IN UPPERCASE ======================//
        boolean isUpperCase = Character.isUpperCase(name[0].charAt(0));
        boolean lowercase2 = Character.isLowerCase(name[0].charAt(1));

        if (isUpperCase == true && lowercase2 == true) {
            return name[0] + " is yelling";
        } 

//============= REQ 2 -  NAME IS UPPERCASE  ============================//
        else if (name.length == 1 && name[0].equals(name[0].toUpperCase())) {
            return name[0] + " IS YELLING";
        }

        return name[0];
    }
}

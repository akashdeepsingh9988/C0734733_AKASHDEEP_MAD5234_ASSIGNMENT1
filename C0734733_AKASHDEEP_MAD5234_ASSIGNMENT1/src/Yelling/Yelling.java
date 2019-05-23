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
        boolean isUpperCase = Character.isUpperCase(name[0].charAt(0));
        boolean lowercase2 = Character.isLowerCase(name[0].charAt(1));
        if (isUpperCase == true && lowercase2 == true) {
            return name[0] + "is yelling";
        } else if (name[0].equals(name[0].toUpperCase())) {
            return name[0] + "IS YELLING";
        } else if (name[0] == null) {
            return "Nobody is yelling";
        } //for two values
        else if (name[0] != null && name[1] != null) {
            return name[0] + "and" + name[1] + "are yelling";

        }
        return name[0];

    }
}

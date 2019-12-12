package hammy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }

    public static boolean  isIsogram(String str) {
        System.out.println(str);
        str = str.toLowerCase();
        if(str.equals("")) return true;
        String first = String.valueOf(str.charAt(0));
        String sub = str.substring(1);
        if(sub.contains(first)) return false;
        else return isIsogram(sub);

    }
}

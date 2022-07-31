/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
       Given 2 strings, a and b, return the number of the positions where they contain the
       same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
       and "az" substrings appear in the same place in both strings.
       stringMatch("xxcaazz", "xxbaaz") → 3
       stringMatch("abc", "abc") → 2
       stringMatch("abc", "axc") → 0
*/
import java.util.Scanner;

public class PR1_5 {
    String a = "";
    String b = "";

    public PR1_5(String a, String b) {
        this.a = a;
        this.b = b;
    }

    // function to return same substring number of length 2.
    public int stringMatch() {
        int cnt = 0;
        int minLen = Math.min(a.length(), b.length());

        for (int i = 0; i < minLen - 1; i++) {
             String tmp1 = a.substring(i,i+2);
            String tmp2 = b.substring(i,i+2);
            if (tmp1.equals(tmp2)) {
                cnt++;
            }
        }
        return cnt;
    }
}
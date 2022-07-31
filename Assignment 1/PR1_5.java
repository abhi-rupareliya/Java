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
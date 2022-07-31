public class PR1_6 {
    String[] arrayStrings;
    String target;

    public PR1_6(String[] arrayStrings, String target) {
        this.arrayStrings = arrayStrings;
        this.target = target;
    }

    // function returns string array after removing target string.
    public String[] wordWithout() {
        int count = 0;
        //for loop to determine the length of the result array.
        for (String arrayString : arrayStrings) {
            if (target.equals(arrayString)) {
                count++;
            }
        }
        //assigning elements by removing target elements in result array.
        String[] s2 = new String[arrayStrings.length - count];
        for (int i = 0, j = 0; i <= s2.length; i++) {
            if (target.equals(arrayStrings[i])) {
                continue;
            } else {
                s2[j] = arrayStrings[i];
                j++;
            }
        }
        return s2;
    }
}

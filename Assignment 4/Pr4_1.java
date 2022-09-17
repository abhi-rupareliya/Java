/*
    Name : Abhi Rupareliya.
    ID   : 21CE117.
    Pr   : WAP to show the try - catch block to catch the different types of exception.
*/
package P4;
class Pr4_1 {
    public static void main(String[] args) {

        // ArrayIndexOutOfBound
        try {
            int a = 10;
            System.out.println(a / 0);
        } catch (Exception e) {
            System.out.println(e);
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[3];
            System.out.println(array[3]);
        } catch (Exception e) {
           System.out.println(e);
        }

        // ClassCastException
        try {
            Object obj = new Object();
            String sobj = (String) obj;
        } catch (Exception e) {
            System.out.println(e);
        }

        // NullPointerException
        try {
            Integer b = null;
            if (b == 10) {
                System.out.println("Same");
            } else {
                System.out.println("Not same");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // NumberFormatException
        try {
            String s = "9.45";
            Integer i = Integer.parseInt(s);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }

        // IllegalArgumentException
        try {
            Thread.sleep(-100);
        } catch (Exception e) {
            System.out.println(e);
        }

        // NegativeArraySizeException
        try {
            int[] array2 = new int[-3];
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

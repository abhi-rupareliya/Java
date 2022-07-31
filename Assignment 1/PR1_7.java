public class PR1_7 {
    int row;

    public PR1_7() {
    }

    //Constructor to initialize number of rows
    public PR1_7(int row) {
        this.row = row;
    }

    //This function will print a pyramid by dividing it into two triangles.
    public void printPyramid() {
        int i, j;
        String s = " ";
        for (i = 0; i <= row - 1; i++) {
            // this 2 for loops will print left "right angle"triangle
            for (j = 1; j <= row - i; j++) {
                System.out.printf("%5s", s);
            }
            for (j = 0; j <= i; j++) {
                System.out.printf("%5d", (int) Math.pow(2, j));
            }
            //prints the 5 row triangle.
            for (j = i - 1; j >= 0; j--) {
                System.out.printf("%5d", (int) Math.pow(2, j));
            }
            System.out.println();
        }
    }
}

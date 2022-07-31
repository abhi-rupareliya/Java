public class PR1_3 {
    int num1 , num2 ;

    public PR1_3(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean lastDigit() {
        num1 = num1 % 10;
        num2 = num2 % 10;
        if (num1 == num2)
            return true;
        else
            return false;
    }
}

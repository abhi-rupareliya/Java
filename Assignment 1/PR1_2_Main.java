/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
        Given a string, return a string made of the first 2 chars (if present), however include
        first  char  only  if  it  is  'o' and include  the  second  only  if  it  is  'z',  so
        "ozymandias" yields "oz".startOz("ozymandias") → "oz"startOz("bzoo") → "z"startOz("oxx") → "o"
*/

import java.util.Scanner;

public class PR1_2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the string : ");
        str = sc.next();
        PR1_2 object = new PR1_2();
        object.startOz(str);
        sc.close();
    }
}


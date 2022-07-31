/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
        Given a string, return a string made of the first 2 chars (if present), however include
        first  char  only  if  it  is  'o' and include  the  second  only  if  it  is  'z',  so
        "ozymandias" yields "oz".startOz("ozymandias") → "oz"startOz("bzoo") → "z"startOz("oxx") → "o"
*/
public class PR1_2 {
    public void startOz(String s) {
        if (s.charAt(0) == 'o') {
            if (s.charAt(1) == 'z') {
                System.out.println("oz");
            } else {
                System.out.println("o");
            }
        }
        else{
            if(s.charAt(1)=='z'){
                System.out.println("z");
            }
        }
    }
}
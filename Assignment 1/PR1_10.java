/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
       Implement Caesar Cipher.
*/
public class PR1_10 {
    String message = new String("");
    String cipherTxt = new String("");
    int shift;

    public PR1_10(String message,int shift) {
        this.message = message;
        this.shift = shift;
    }

    // function for Caesar Cipher.
    public String implement(){
        for (int i = 0; i < message.length(); i++) {
            message = message.toLowerCase();
               char replaceVal = (char) (((int) message.charAt(i) + shift - 65) % 26 + 65);
                cipherTxt = cipherTxt+ replaceVal;

        }
        return cipherTxt;
    }

}

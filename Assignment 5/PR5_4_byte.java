
/*
 * Name: Abhi Rupareliya
 * Id  : 21ce117
 * Aim : WAP to show use of character and byte stream.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PR5_4_byte {
	public static void main(String[] args) {
		try {
			FileInputStream fr = new FileInputStream("C:\\AAA Shortcut\\Java programs\\Assignment 5\\download.png");
			FileOutputStream fw = new FileOutputStream(
					"C:\\AAA Shortcut\\Java programs\\Assignment 5\\copy_download.png");

			int i = 0;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
			System.out.println("File Copied.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

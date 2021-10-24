import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingMail {
	public static void extractEmailIds(BufferedReader br,PrintWriter pw,Pattern p) throws Exception	{

		String line = br.readLine();

		while (line != null) {
			Matcher m = p.matcher(line);

			while (m.find()) {
				pw.println(m.group());
			}	
			line = br.readLine();
		}
		pw.flush();
	}
	
public static void main(String[] args) throws Exception	{
		PrintWriter pw = new PrintWriter("D:\\ValidMails.txt");
		Pattern p = Pattern.compile("[a-zA-Z0-9]"+ "[a-zA-Z0-9_.]" + "*@[a-zA-Z0-9]"+ "+([.][a-zA-Z]+)+");
		BufferedReader br = new BufferedReader(new FileReader("D:\\Emails.txt"));

				extractEmailIds(br, pw, p);
	}
}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passport {

	public static void main(String[] args) {
		
				String input = "A1234567, L1234123";
				String regex =  "[A-Z]{1}[0-9]{7}";
				
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(input);
				
				if(m.find()) {
					System.out.println("Accepted");
				}else {
					System.out.println("Denied");
				}
				
				
	}

}

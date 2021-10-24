import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PAN {
 
		public static void main(String[] args) {
			
			String input = "ANGPA1234G";
			String regex = "[A-Z0-9]{10}";
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(input);
			
			if(m.find() && m.group().equals(input)) {
				System.out.println(m.find());
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
			
			
		}
}

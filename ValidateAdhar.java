import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAdhar {
  
	
		public static void main(String[] args) {
			
			String input = "1111222233334444";
			String regex = "[0-9]\\d{15}";
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(input);
			
			if(m.find()) {
				System.out.println(m.find());
				System.out.println("Valid Adhar Number");
			}else {
				System.out.println("Invalid Adhar Number");
			}
		}
}

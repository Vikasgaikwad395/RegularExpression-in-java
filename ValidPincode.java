import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPincode {

	
			public static void main(String[] args) {
				
				String input = "500055, 500058";
				String regex = "[0-9]\\d{5}";
				
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(input);
				
				
				if(m.find()) {
					System.out.println(m.find());
					System.out.println("Valid Pincode no");
				}else {
					System.out.println("Invalid Pincode No");
				}
			}
}

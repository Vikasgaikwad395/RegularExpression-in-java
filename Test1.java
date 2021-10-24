import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test1 {

	public static void main(String[] args) throws Exception{
		
		
		Path path = Paths.get("D:\\Vikas\\abc.txt");
		
		if(Files.exists(path)) {
			List<String> data = Files.readAllLines(path);
			for(String line : data) {
				System.out.println(line);
			}
			
		}else {
			System.out.println("not existed");
		}
	}

}

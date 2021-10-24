import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreateFile {

	public static void main(String[] args) throws Exception{
		
		Path path = Paths.get("D:\\Score.txt");
		
		if(!Files.exists(path)){
			Files.createFile(path);
			Files.writeString(path, "Your score is 55", StandardOpenOption.APPEND);
				System.out.println("Created");
			}else{
				System.out.println("File is already created");
			}
			}

}

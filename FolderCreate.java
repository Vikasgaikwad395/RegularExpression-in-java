import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FolderCreate {

	public static void main(String[] args) throws Exception{
			String File = "D:\\Folder";
			String File1 = "D:\\Folder\\File.txt, File2.txt";
			
			
		Path path = Paths.get(File);
		 
	Path path1 = Paths.get(File1);
	
			
		
		if(!Files.exists(path)) {
			Files.createDirectories(path);
			System.out.println("Folder Created");
		}else {
			System.out.println("Folder is alraedy exist");
	
		}
			if(!Files.exists(path1)) {
				Files.createFile(path1);
				System.out.println("Files Created");		
				
			}else {
				System.out.println("File already created");
			}
	
	}
	
	
	

}

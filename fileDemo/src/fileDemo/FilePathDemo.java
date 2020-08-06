package fileDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathDemo {

	public static void main(String[] args) throws IOException {

		Path relativePath = Paths.get("file1.txt");
		System.out.println(relativePath);
		System.out.println(relativePath.toAbsolutePath());
		String windowsPath1 = "C:/Users/jason/eclipse-workspace/fileDemo/file1.txt";
		System.out.println(Files.exists(relativePath));
		if (!Files.exists(relativePath)) {
			try {
				Files.createFile(relativePath);
			} catch (IOException e) {
				System.out.println("unable to create file " + relativePath);

			
			
				 try {
			            FileReader reader = new FileReader("file1.txt");
			            BufferedReader bufferedReader = new BufferedReader(reader);
			 
			            String line;
			 
			            while ((line = bufferedReader.readLine()) != null) {
			                System.out.println(line);
			            }
			            reader.close();
			 
			        } catch (IOException i) {
			            i.printStackTrace();
					}
				}
			}
		}
	}

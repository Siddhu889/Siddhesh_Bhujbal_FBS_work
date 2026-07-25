package p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TestSequential {
	public static void readFile(String path,List<String> list) {
		try(FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader= new BufferedReader(fileReader);)
		{
				String str=bufferedReader.readLine();
				while(str!=null) {
					list.add(str);
					str=bufferedReader.readLine();
				}
			}
			catch (IOException e) {
				System.out.println("File Not Found");
			}
	}
	public static void main(String[] args) {
		String firstNamePath="D:\\\\Siddhesh Bhujbal\\\\Siddhesh_Firstbit\\\\Siddhesh_Bhujbal_FBS_work_main\\\\Siddhesh_Bhujbal_FBS_work_main\\\\Core_Java_module\\\\My_Java_WorkSpace\\\\My_2026_07_07 (Multithreading Assignment)\\\\src\\\\files\\\\first_names.txt";
		String lastNamePath="D:\\\\Siddhesh Bhujbal\\\\Siddhesh_Firstbit\\\\Siddhesh_Bhujbal_FBS_work_main\\\\Siddhesh_Bhujbal_FBS_work_main\\\\Core_Java_module\\\\My_Java_WorkSpace\\\\My_2026_07_07 (Multithreading Assignment)\\\\src\\\\files\\\\last_names.txt";
		
		LinkedList<String> firstNames = new LinkedList<String>();
		LinkedList<String> lastNames = new LinkedList<String>();
		LinkedList<String> fullNames = new LinkedList<String>();
		
		long start = System.nanoTime();
		readFile(firstNamePath, firstNames);
		readFile(lastNamePath, lastNames);
		
		for(int i=0;i<firstNames.size();i++) {
			fullNames.add(firstNames.get(i) + " " + lastNames.get(i));
		}
		
		System.out.println(fullNames);
		long end = System.nanoTime();
		System.out.println("Sequential Merge Execution time: " + (end - start) / 1_000_000.0 + " ms");
	}

}




//First Code
//try(FileReader fileReader1 = new FileReader(firstNamePath);
//		BufferedReader bufferedReader1= new BufferedReader(fileReader1);
//		FileReader fileReader2 = new FileReader(lastNamePath);
//		BufferedReader bufferedReader2= new BufferedReader(fileReader2);)
//	{
//		String firstName=bufferedReader1.readLine();
//		String lastName=bufferedReader2.readLine();
//		
//		while(firstName!=null && lastName!=null) {
//			System.out.println(firstName+" "+lastName);
//			firstName=bufferedReader1.readLine();
//			lastName=bufferedReader2.readLine();
//		}
//	} 
//	catch (IOException e) {
//		e.printStackTrace();
//	}
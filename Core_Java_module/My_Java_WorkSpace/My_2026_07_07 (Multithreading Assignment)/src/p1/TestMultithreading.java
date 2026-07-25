package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FirstName extends Thread
{
	String firstNamePath="D:\\Siddhesh Bhujbal\\Siddhesh_Firstbit\\Siddhesh_Bhujbal_FBS_work_main\\Siddhesh_Bhujbal_FBS_work_main\\Core_Java_module\\My_Java_WorkSpace\\My_2026_07_07 (Multithreading Assignment)\\src\\files\\first_names.txt";
	public static void readFile(String path)
	{
		try(FileReader fileReader = new FileReader(path);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				){
			String str = bufferedReader.readLine();
			while(str!=null)
			{
				System.out.println(str);
				try
				{
					Thread.sleep(1);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				str=bufferedReader.readLine();
			}
		}
		catch(IOException e)
		{
			System.out.println("File Not Found");
		}
	}
	
	public void run()
	{
		readFile(firstNamePath);
	}
}
public class TestMultithreading extends FirstName{
      
	public static void main(String[] args) {
		long start = System.nanoTime();
		FirstName fn = new FirstName();
		fn.start();
		String lastNamePath="D:\\Siddhesh Bhujbal\\Siddhesh_Firstbit\\Siddhesh_Bhujbal_FBS_work_main\\Siddhesh_Bhujbal_FBS_work_main\\Core_Java_module\\My_Java_WorkSpace\\My_2026_07_07 (Multithreading Assignment)\\src\\files\\last_names.txt";
		readFile(lastNamePath);
		long end = System.nanoTime();
		System.out.println("Multithreading Execution time: "+(end - start) / 1_000_000.0 +" ms");
	}
}

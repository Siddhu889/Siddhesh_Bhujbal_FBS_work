package p1;

import java.io.*;

public class TestFile {

	public static void mainWrite(String[] args) {
		// TODO Auto-generated method stub
        try {
			FileOutputStream fos = new FileOutputStream("D:\\Siddhesh Bhujbal\\Siddhesh_Firstbit\\Siddhesh_Bhujbal_FBS_work_main\\Siddhesh_Bhujbal_FBS_work_main\\Core_Java_module\\My_Java_WorkSpace\\My_2026_07_03 (File Handling)\\src\\p1\\Data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			oos.writeObject(new Student(12,"Rahul",200));
			System.out.println("Written SuccessFully");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main ends here

      public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Siddhesh Bhujbal\\Siddhesh_Firstbit\\Siddhesh_Bhujbal_FBS_work_main\\Siddhesh_Bhujbal_FBS_work_main\\Core_Java_module\\My_Java_WorkSpace\\My_2026_07_03 (File Handling)\\src\\p1\\Data.txt");
			DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(dis);
			Student s1 =(Student)ois.readObject();
			System.out.println(s1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
}


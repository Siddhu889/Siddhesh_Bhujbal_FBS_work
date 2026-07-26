package p1;

import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ConnectivityFactory {

	public static Connectivity getObject()
	{
		try {
			FileInputStream fin=new FileInputStream("class.txt");
			Scanner sc = new Scanner(fin);
			String className=sc.nextLine();
			
			Class meta=Class.forName(ClassName);
			ref=(Connectivity)meta.getConstructor().newInstance();
			return ref;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

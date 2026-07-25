class Date{
	int day,month,year;
}//Class Date ends here

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1;
        d1=new Date();
        System.out.println(d1);
        Date d2=new Date();
        System.out.println(d2);
        d1.day=2;
        d1.month=9;
        d1.year=2025;
        System.out.println(d1.day+"/"+d1.month+"/"+d1.year);
	}

}

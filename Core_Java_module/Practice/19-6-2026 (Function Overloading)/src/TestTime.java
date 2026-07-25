class Time
{
	int hr,min,sec;

	void format()
	{
		if(this.sec >= 60)
		{
			this.min += this.sec / 60;
			this.sec = this.sec % 60;
		}

		if(this.min >= 60)
		{
			this.hr += this.min / 60;
			this.min = this.min % 60;
		}

		this.hr = this.hr % 24;
	}

	Time(int hr, int min, int sec)
	{
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

	Time()
	{
		this.hr = 0;
		this.min = 0;
		this.sec = 0;
	}

	int getHr()
	{
		return hr;
	}

	void setHr(int hr)
	{
		this.hr = hr;
	}

	int getMin()
	{
		return min;
	}

	void setMin(int min)
	{
		this.min = min;
	}

	int getSec()
	{
		return sec;
	}

	void setSec(int sec)
	{
		this.sec = sec;
	}

	void display()
	{
		System.out.println("Time is : " + this.hr + ":" + this.min + ":" + this.sec);
	}

	Time add(Time t1, Time t2)
	{
		Time temp = new Time();

		temp.hr = t1.hr + t2.hr;
		temp.min = t1.min + t2.min;
		temp.sec = t1.sec + t2.sec;

		temp.format();

		return temp;
	}

	void add(int hr, int min, int sec)
	{
		this.hr += hr;
		this.min += min;
		this.sec += sec;

		format();
	}
} // class Time ends here

public class TestTime
{
	public static void main(String[] args)
	{
		Time t1 = new Time(5,10,20);
		t1.display();

		Time t2 = new Time(20,50,12);

		Time result = new Time();
		result = result.add(t1,t2);
		result.display();

		t1.add(15,20,20);
		t1.display();
	}
} // class TestTime ends here
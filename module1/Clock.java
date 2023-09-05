package module1;
import java.util.*;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	private String ap;
	Clock(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	void isValid( ) {
		if((hour>=0&&hour<24)&&(minute>=0&&minute<=59)&&(second>=0&&second<=59))
		{
			System.out.println("valid time");
		}
		else
		{
			System.out.println("invalid time");
		}
	
	}
	
	void setTime() {
		
		if(hour<12)
		{
			System.out.println("Time:"+hour+":"+minute+":"+second+"AM");
		}
		else
		{
			hour-=12;
			System.out.println("Time:"+hour+":"+minute+":"+second+"PM");
		}
	
		
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int h,m,s;
		System.out.println("Enter hour");
		h=sc.nextInt();
		System.out.println("Enter minute");
		m=sc.nextInt();
		System.out.println("Enter second");
		s=sc.nextInt();
		Clock clock=new Clock(h,m,s);
		clock.isValid();
		clock.setTime();
		
	}
}

import java.lang.*;

public class EmployeeWaagePartTime
{
	//instance variable
	short wagePerHour;
	short fullDayHour;
	short partTimeHour;
	public static void main(String arg[])
	{
		
		EmployeeWaagePartTime dailyWage = new EmployeeWaagePartTime(); 
		EmployeeWaagePartTime partTime = new EmployeeWaagePartTime(); 
		
		dailyWage.wagePerHour = 20;
		dailyWage.fullDayHour=16;

		partTime.partTimeHour=8;
		
		int calculate = (int)(dailyWage.wagePerHour * dailyWage.fullDayHour);
		System.out.println("The full time employee wage is :"+calculate+"rs");
		
		calculate = (int)(dailyWage.wagePerHour * partTime.partTimeHour);
		System.out.println("The part time employee wage is :"+calculate+"rs");

	}
}
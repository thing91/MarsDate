import java.util.Scanner;
import java.util.ArrayList;

public class Earth {
	public static int[] yearDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static int[] leapYearDays = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String args[]){
		
	}
	public int input(){
		Scanner input = new Scanner(System.in);

		int year, month, day;

		System.out.println("Please input Earth year: ");
		year = input.nextInt();
		System.out.println("Please input Earth month: ");
		month = input.nextInt();
		System.out.println("Please input Earth day: ");
		day = input.nextInt();
	
		return day_count(year, month, day);		
	}
	
	public int day_count(int y, int m, int d){
		int start_date = 1961;
		int days_count = 0;
		int year_count = y-start_date;
		// System.out.println("Number of years: " + year_count);
		int while_date = start_date;
		while(while_date<y){
			if(y%4==0){
				days_count += 366;
			}
			else{
				days_count += 365;
			}
			while_date++;
		}
		for(int i = 1; i < m; i++){
			days_count += yearDays[i];
		}
		days_count += d;
		System.out.println("Number of days since beginning: " + days_count);
		return days_count;
	}
}
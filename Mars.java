public class Mars{
	public static final int[] MARS_MONTHS_DAYS = {61,65,66,65,60,54,50,47,46,48,51,56};
	public static final String[] MARS_MONTHS = {"Gemini","Cancer","Leo","Virgo","Libra","Scorpius","Sagittarius","Capricorn","Aquarius","Pisces","Aries","Taurus"};
	public static void output(int y, String m, int day){
		System.out.println();
	}
	public static void calculation(int earth_days){
		int mars_years, mars_year_len = 669, days_in_year, mars_month;
		mars_years = earth_days / mars_year_len + 1;
		days_in_year = earth_days % mars_year_len;
		System.out.println(days_in_year);
		int i = 0;
		while(days_in_year > MARS_MONTHS_DAYS[i]) {
			days_in_year -= MARS_MONTHS_DAYS[i];
			System.out.println(days_in_year + " - " + MARS_MONTHS_DAYS[i]);
			i++;
			System.out.println("month: " + i);
		}
		mars_month = i;
		System.out.format("This earth date on Mars is: " + mars_years + " " + MARS_MONTHS[mars_month] + " " + days_in_year);
	}
}
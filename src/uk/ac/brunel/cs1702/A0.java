package uk.ac.brunel.cs1702;

public class A0 {
	
	static int month = 9; //September
	static int daysinmonth = 0;
	
	static public void main(String args [])
	{						
		switch(month)
		{
			case 1: //January 
				daysinmonth = 31;
				break;
			case 2: //February
				daysinmonth = 28;
				break;
			case 3: //March
				daysinmonth = 31;
				break;
			case 4: //April
				daysinmonth = 30;
				break;
			case 5: //May
				daysinmonth = 31;
				break;
			case 6: //June
				daysinmonth = 30;
				break;
			case 7: //July
				daysinmonth = 31;
				break;
			case 8: //August
				daysinmonth = 31;
				break;
			case 9: //September
				daysinmonth = 30;
				break;
			case 10: //October
				daysinmonth = 31;
				break;
			case 11: //November
				daysinmonth = 30;
				break;
			case 12: //December
				daysinmonth = 31;
				break;
			default: 
				daysinmonth = -1;
				break;
		}
		
		System.out.println("Days in month " + month + " = " + daysinmonth);
	}
}

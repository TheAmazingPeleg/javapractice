package Ben;

public class Ben {
	/*1. Write a Java function that gets a number as attribute and print whether it is positive or negative.
	 *	Example:
	 *	Input number: 35
	 *	Expected Output :
	 *	Number is positive
	 */
	public static void posOrNeg(int num) {
		if(num > 0)
			System.out.println("Positive Number");
		else
			if(num == 0)
				System.out.println("Neutral Number");
			else
				System.out.println("Negative Number");
	}
	/* 2. Write a Java function that takes three numbers as attribute and return the greatest number.
	 * Example:
	 * Input the 1st number: 25
	 * Input the 2nd number: 78
	 * Input the 3rd number: 87
	 * Expected Output :
	 * The greatest: 87
	 */
	public static int greatest(int num1, int num2, int num3) {
		if(num1 > num2)
			if(num1 > num3)
				return num1;
			else
				return num3;
		else
			if(num2 > num3)
				return num2;
			else
				return num3;
	}
	/*
	 * 3. Write a Java function that takes month as attribute and print number of days.
	 * Example:
	 * Input the month: 2
	 * Expected Output :
	 * in February there are 30 days
	 */
	public static void daysOfMonth(int month) {
		switch(month) {
			case 1:
				System.out.println("In January there are 31 days");
				break;
			case 2:
				System.out.println("In February there are 30 days");
				break;
			case 3:
				System.out.println("In March there are 31 days");
				break;
			case 4:
				System.out.println("In April there are 30 days");
				break;
			case 5:
				System.out.println("In May there are 31 days");
				break;
			case 6:
				System.out.println("In June there are 30 days");
				break;
			case 7:
				System.out.println("In July there are 31 days");
				break;
			case 8:
				System.out.println("In August there are 31 days");
				break;
			case 9:
				System.out.println("In September there are 30 days");
				break;
			case 10:
				System.out.println("In October there are 31 days");
				break;
			case 11:
				System.out.println("In November there are 30 days");
				break;
			case 12:
				System.out.println("In December there are 31 days");
				break;
		}
	}
	
	public static void main(String[] args) {
		//First Function
		posOrNeg(250);
		posOrNeg(0);
		posOrNeg(-50);
		
		//Break Line
		System.out.println();
		
		//Second Function
		System.out.println(greatest(150,2120,30));
		
		//Break Line
		System.out.println();
		
		//Third Function
		daysOfMonth(8);
	}
}

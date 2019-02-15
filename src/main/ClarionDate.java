package main;

import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class ClarionDate {
	private static int year = 1801;
	private static int month = 1;
	private static int day = 1;
	private static int dateTopSpeed = 3;

	public static int setyear(int data) {
		int daysInYear = Year.of(year).length();

		int i = daysInYear;
		while (i < data) {
			year = year + 1;
			daysInYear = Year.of(year).length();
			i = i + daysInYear;
		}
		return i - daysInYear;
	}

	public static int setmonth(int data) {
		boolean isLeap = Year.isLeap(year); // Високосный год или нет
		int daysInMonth = Month.of(1).length(isLeap);

		int i = daysInMonth;
		while (i < data) {
			month = month + 1;
			daysInMonth = Month.of(month).length(isLeap);
			i = i + daysInMonth;

		}
		return i - daysInMonth;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter clarion number: ");
		int num = in.nextInt();
		in.close();

		System.out.println("Gregorian date");
		// Корректировка
		num = num - dateTopSpeed;
		// Устанавливаем значение года		
		num = num - setyear(num);
		// Устанавливаем значение года
		num = num - setmonth(num);
		day = num;
		System.out.printf("Year: %d \n", year);
		System.out.printf("Month: %d \n", month);
		System.out.printf("Day: %d \n", day);
	}

}

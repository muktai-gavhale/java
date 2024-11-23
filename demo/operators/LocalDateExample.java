package demo.operators;

import java.time.LocalDate;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDate.*;

public class LocalDateExample {
	public static void main(String args[]) {
		LocalDate date=LocalDate.now();
		LocalDate yesterday	=date.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		System.out.println("Today Date:"+date);
		System.out.println("yesterday Date:"+yesterday);
		System.out.println("tomorrow Date:"+tomorrow);
		
		//LocalDate date=LocalDate.of(2017, 7, 20);
		//System.out.println(date.isLeapYear());
		//LocalDate date1=LocalDate.of(2016, 7, 20);
		//System.out.println(date.isLeapYear());
		
		
	} 

}

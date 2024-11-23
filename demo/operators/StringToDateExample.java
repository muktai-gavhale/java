package demo.operators;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {
	public static void main(String args[]) throws ParseException  {
		String sDate1="20/07/2002";
		Date date1=new SimpleDateFormat("DD/MM/YY").parse(sDate1);
		
		System.out.println(sDate1+"\t"+date1);
	}

}

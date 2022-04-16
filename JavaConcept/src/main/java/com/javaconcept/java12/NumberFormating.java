package com.javaconcept.java12;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormating {

	public static void main(String[] args) throws ParseException {
		/*
		 * // Create new CompactNumberFormat instance NumberFormat fmt =
		 * NumberFormat.getCompactNumberInstance(new Locale("hi", "IN"),
		 * NumberFormat.Style.SHORT);
		 * 
		 * NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US,
		 * NumberFormat.Style.LONG);
		 * 
		 * //Custom CompactNumberFormat instance final String[] compactPatterns = { "",
		 * "", "", "0k", "00k", "000k", "0m", "00m", "000m", "0b", "00b", "000b", "0t",
		 * "00t", "000t" };
		 * 
		 * final DecimalFormat decimalFormat = (DecimalFormat)
		 * NumberFormat.getNumberInstance(Locale.GERMANY);
		 * 
		 * final CompactNumberFormat customCompactNumberFormat = new
		 * CompactNumberFormat(decimalFormat.toPattern(),
		 * decimalFormat.getDecimalFormatSymbols(), compactPatterns);
		 */
		
		
		 NumberFormat fmt = NumberFormat
	                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
	 
	        System.out.println( fmt.format(100) );
	        System.out.println( fmt.format(1000) );
	        System.out.println( fmt.format(10000) );
	        System.out.println( fmt.format(100000) );
	 
	        NumberFormat fmtShort = NumberFormat
	                .getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
	 
	        System.out.println( fmtShort.format(100) );
	        System.out.println( fmtShort.format(1000) );
	        System.out.println( fmtShort.format(10000) );
	        System.out.println( fmtShort.format(100000) );
	        
	        System.out.println("<------------------------>");
	        
	        
	       NumberFormat fmt1 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
	        fmt1.setMinimumFractionDigits(3);
	 
	        System.out.println( fmt1.format(10000) );
	        System.out.println( fmt1.format(10012) );
	        System.out.println( fmt1.format(100201) );
	        System.out.println( fmt1.format(1111111) ); 
	        
	        System.out.println("<------------------------>");
	        
	        NumberFormat fmt3 = NumberFormat
	                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
	 
	        System.out.println( fmt3.parse("100") );
	        System.out.println( fmt3.parse("1 thousand") );
	        System.out.println( fmt3.parse("10 thousand") );
	        System.out.println( fmt3.parse("100 thousand") );
	        
	    }

}



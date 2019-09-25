package com.lanstad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		Date mydate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		System.out.println(sdf.format(mydate));
	}

}

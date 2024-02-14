package com.pgr.jsp;

import java.util.ArrayList;

public class EmployeeList {

	public static ArrayList<String> list() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Demo1");
		al.add("Demo2");
		
		for(String s: al) {
			System.out.println(s);
		}
		return al;
	}
}

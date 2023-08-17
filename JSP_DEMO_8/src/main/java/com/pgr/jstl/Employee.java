package com.pgr.jstl;

import java.util.ArrayList;

public class Employee {

	ArrayList<String> names = new ArrayList<>();

	public ArrayList<String> getNames() {

		names.add("PerlaReddy");
		names.add("Sireesha");
		names.add("Dhruvika");
		names.add("Dhatrika");

		return names;
	}
}

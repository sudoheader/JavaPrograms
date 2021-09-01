package com.sudoheader.java;

public class AvoidGarbageCollection {

	public static void main(String[] args) {
		person p1 = new person("John", "Doe", "1999 Main St, New York, NY");

		StringBuilder build = new StringBuilder();
		build.append(person.getLastName());
		build.append(", ");
		build.append(person.getFirstName());
		build.append(" lives at ");
//		build.append(person.getAddress().getStreet1());
		build.append("; ");
//		build.append(person.getAddress().getCity());
		build.append(", ");
//		build.append(person.getAddress().getState());
		System.out.println(build.toString());
	}
}

class person {
	private static String firstName;
	private static String lastName;
	private int age;
	private static String address;

	public person(String firstName, String lastName, String address) {

	}

	private static String street1;
	private static String city;
	private static String state;

	public static String getFirstName() {
	    return firstName;
	  }

	public static String getAddress() {
		address = street1 + city + state;
		return address;
	}


	public static String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int ageVal) {
		age = ageVal;
	}
}

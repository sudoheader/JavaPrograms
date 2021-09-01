package com.sudoheader.java;

class newthread extends Thread {
	Thread t;
	String name; 
	newthread(String threadname) {
		name = threadname;
		t = new Thread(this.name);
		t.start();
	}
	
	public void run() { }
}

class Multithreaded_Programming {
	
	public static void main(String[] args) {
		
		newthread obj1 = new newthread("one");
		newthread obj2 = new newthread("two");
		try {
			System.out.println(obj1.t.equals(obj2.t));
		} catch(Exception e) {
			System.out.println("Main thread interrupted");
		}
	}
}

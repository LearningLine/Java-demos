package com.develop;

import static java.lang.System.out;

class Pet
{
	String name;
	public synchronized void setName(String name) {
		this.name = name;
	}
}

class Dog extends Pet implements Runnable 
{

	@Override
	public void run() {
		out.println("run spot run");
		out.println("run spot run");
		out.println("run spot run");
	}
	
}

public class ThreadsApp {

	public static void printThreadName() {
		out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) throws Exception {
		printThreadName();
		
		Thread t = new Thread() {
			@Override
			public void run()  {
				try {
					for (int i = 0; i < 20; ++i) {
						out.print("Iteration : " + i + " for ");
						printThreadName();
						Thread.sleep(500);
					}
				} catch (Exception e) {
					e.printStackTrace(out);
				}
			}
		};
		t.setName("My Thread");
		t.setDaemon(true);
		t.start();
		out.println("Leaving main thread");
		Thread.sleep(1500);
		
		Thread t1 = new Thread(new Dog());
		t1.start();
		
		Thread t2 = new Thread( () -> out.println("lambda thread function") );
		t2.start();
		
		Pet p = new Dog();
		p.setName("Sparky");
		for (int i = 0; i < 5; ++i) {
			new Thread( () -> p.setName(Thread.currentThread().getName())).start();
		}
		out.println(p.name);
		
	}

}

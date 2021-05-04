package com.niit;

public class HelloRunner extends Thread {

	int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 i = 0;
		 while (true) {
			 
			 try {
				 Thread.sleep(2000);
				  } catch (InterruptedException e) {
				  // This thread’s sleep was interrupted
				  // by another thread
				  }
		 System.out.println("Hello " + i++);
		 if ( i == 10 ) {
		 break;
		 }
		 }
	}
	
	
	

}

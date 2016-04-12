package library;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class RemindTask extends TimerTask{
	Toolkit toolkit;

	  Timer timer;

//	  public void ReminderBeep(int seconds) {
//	    toolkit = Toolkit.getDefaultToolkit();
//	    timer = new Timer();
//	    timer.schedule(new RemindTask(), seconds * 1000);
//	  }
	 public void run() {
		  doSomeWork();
	      System.out.println("Time's up!");
	      
	      //toolkit.beep();
	      //timer.cancel(); //Not necessary because we call System.exit
	      System.exit(0); //Stops the AWT thread (and everything else)
	    }
	 
	 private void doSomeWork(){
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	public static void main(String[] args) {
		//TimerTask timertask = new TimerSchedulePeriod()
	}
}

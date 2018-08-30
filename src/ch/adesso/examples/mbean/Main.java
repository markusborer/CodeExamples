package ch.adesso.examples.mbean;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class Main {

	public static void main(String[] args) {
		try {
			MBeanServer mbs = ManagementFactory.getPlatformMBeanServer(); 
	        ObjectName name = new ObjectName("ch.adesso.examples.mbean:type=Hello"); 
	        Hello mbean = new Hello(); 
	        mbs.registerMBean(mbean, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

}

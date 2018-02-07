package gui;

import sensomod.generated.PrinterManagement;

public class TestMain {

	public static void main(String[] args) {
		PrinterManagement pm = new PrinterManagement();
		pm.output("WlanRoom2");
		System.out.println(pm.pms.state);

	}

}

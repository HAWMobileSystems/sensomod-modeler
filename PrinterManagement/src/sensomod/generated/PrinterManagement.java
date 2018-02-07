package sensomod.generated;

import sensomod.generated.Building.Location;

public class PrinterManagement extends Context {

	public PrinterManagement() {
		name = "PrinterManagement";
	}

	private String ssid = "";

	private UserLocation userlocation = new UserLocation();

	private PrinterStatus printerstatus = new PrinterStatus();
	public PrinterManagementState pms = new PrinterManagementState();

	public void decisionLogic() {
		userlocation.output(ssid);
		if (userlocation.getBuilding().getLocation() == Location.NearbyRoom1
				&& printerstatus.output("Room1").getState() != Printer.State.normal) {

			if (printerstatus.output("Room1").getState() == Printer.State.cartridgeempty) {
				pms.state = PrinterManagementState.State.OrderCartridgePrinter;
			}
			if (printerstatus.output("Room1").getState() == Printer.State.paperempty) {
				pms.state = PrinterManagementState.State.RefillPaperPrinter;
			}

		} else if (userlocation.getBuilding().getLocation() == Location.NearbyRoom2
				&& printerstatus.output("Room2").getState() != Printer.State.normal) {

			if (printerstatus.output("Room2").getState() == Printer.State.cartridgeempty) {
				pms.state = PrinterManagementState.State.OrderCartridgePrinter;
			}
			if (printerstatus.output("Room2").getState() == Printer.State.paperempty) {
				pms.state = PrinterManagementState.State.RefillPaperPrinter;
			}

		} else if (userlocation.getBuilding().getLocation() == Location.NearbyRoom3
				&& printerstatus.output("Room3").getState() != Printer.State.normal) {

			if (printerstatus.output("Room3").getState() == Printer.State.cartridgeempty) {
				pms.state = PrinterManagementState.State.OrderCartridgePrinter;
			}
			if (printerstatus.output("Room3").getState() == Printer.State.paperempty) {
				pms.state = PrinterManagementState.State.RefillPaperPrinter;
			}

		} else {
			pms.state = PrinterManagementState.State.nothingToDo;
		}
	}

	public PrinterManagementState output(String location) {
		ssid = location;
		decisionLogic();
		return pms;
	}
}

package sensomod.generated;

public class PrinterStatus extends PhysicalSensor {

	public PrinterStatus() {
		name = "PrinterStatus";
	}

	private Printer printer1 = new Printer("Room1", Printer.State.normal);
	private Printer printer2 = new Printer("Room2", Printer.State.paperempty);
	private Printer printer3 = new Printer("Room3", Printer.State.cartridgeempty);

	public Printer output(String room) {
		switch (room) {
		case "Room1":
			return printer1;
		case "Room2":
			return printer2;
		case "Room3":
			return printer3;
		default:
			return null;
		}
	}
}

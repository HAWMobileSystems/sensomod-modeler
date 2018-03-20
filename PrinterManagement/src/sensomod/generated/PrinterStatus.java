package sensomod.generated;

public class PrinterStatus extends PhysicalSensor {

	public PrinterStatus() {
		name = "PrinterStatus";
	}

	private Printer printer1 = new Printer("Room1", Printer.State.normal);
	private Printer printer2 = new Printer("Room2", Printer.State.paperempty);
	private Printer printer3 = new Printer("Room3", Printer.State.cartridgeempty);
	public Printer printer = null;

	public Printer output(String room) {
		switch (room) {
		case "Room1":
			printer = printer1;
			break;
		case "Room2":
			printer = printer2;
			break;
		case "Room3":
			printer = printer3;
			break;
		}
		return printer;
	}
}

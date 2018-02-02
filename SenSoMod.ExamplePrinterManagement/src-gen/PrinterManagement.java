package sensomod.generated;

public class PrinterManagement extends Context {

    public PrinterManagement() {
        name = "PrinterManagement";
    }

    private UserLocation userlocation;

    private PrinterStatus printerstatus;

    public void decisionLogic() {
        if(UserLocation == NearbyRoom1 && Printer.ID ==PrinterRoom1 && Printer.State != normal){Maintain Printer 1};
    }

    public State output() {
    // TODO
    }
}


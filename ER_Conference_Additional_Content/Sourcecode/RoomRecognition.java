package sensomod.generated;

public class RoomRecognition extends ComputedSensor {

    public RoomRecognition(Beacon beacon) {
        multiple = false;
        this.name = "RoomRecognition";
        this.beacon = beacon;
    }

    private Beacon beacon;

    /*TODO: create logic to return the Room*/
    public Room output() {
    }

    public void decisionLogic() {
        if(Beacon.getMinor()==1 ) {
	Room= "Shop"		}
else if(Beacon.getMinor()==2 ) {
	Room= "LivingRoom"		}
else if(Beacon.getMinor()==3 ) {
	Room= "Kitchen"		}
else if(myIbeacon.getMinor()==4 ) {
	Room= "ConferenceRoom"	
else {
Room="unknown" };
    }

    public Beacon getBeacon() {
        return beacon;
    }

    public void setBeacon(Beacon beacon) {
        this.beacon = beacon;
    }
}
// Use IDE to generate toString and equals methods


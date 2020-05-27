package sensomod.generated;

public class ShopManagement extends Context {

    public ShopManagement(RoomRecognition roomrecognition, ShopLights shoplights, ShopSpeaker shopspeaker) {
        this.name = "ShopManagement";
        this.roomrecognition = roomrecognition;
        this.shoplights = shoplights;
        this.shopspeaker = shopspeaker;
    }

    private RoomRecognition roomrecognition;

    private ShopLights shoplights;

    private ShopSpeaker shopspeaker;

    public void decisionLogic() {
        if (Room.equals("Shop")) {	
	if(ShopLights.getStatus()==0){
		ShopState.Lights ="Off"		
		} else {
		ShopState.Lights ="On"
	} if(ShopSpeaker.getStatus()==0){
       ShopState.Speaker ="Off"
	} else {
	   ShopState.Speaker="On"
	}
};
    }

    /*TODO: create logic to return the ShopState*/
    public ShopState output() {
    }

    public RoomRecognition getRoomrecognition() {
        return roomrecognition;
    }

    public void setRoomrecognition(RoomRecognition roomrecognition) {
        this.roomrecognition = roomrecognition;
    }

    public ShopLights getShoplights() {
        return shoplights;
    }

    public void setShoplights(ShopLights shoplights) {
        this.shoplights = shoplights;
    }

    public ShopSpeaker getShopspeaker() {
        return shopspeaker;
    }

    public void setShopspeaker(ShopSpeaker shopspeaker) {
        this.shopspeaker = shopspeaker;
    }
}
// Use IDE to generate toString and equals methods


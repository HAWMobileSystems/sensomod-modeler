package sensomod.generated;

public class KitchenManagement extends Context {

    public KitchenManagement(RoomRecognition roomrecognition, KitchenLight kitchenlight, KitchenSpeaker kitchenspeaker) {
        this.name = "KitchenManagement";
        this.roomrecognition = roomrecognition;
        this.kitchenlight = kitchenlight;
        this.kitchenspeaker = kitchenspeaker;
    }

    private RoomRecognition roomrecognition;

    private KitchenLight kitchenlight;

    private KitchenSpeaker kitchenspeaker;

    public void decisionLogic() {
        if (Room.equals("Kitchen")) {	
	if(KitchenLights.getStatus()==0){
		KitchenState.Lights ="Off"		
		} else {
		KitchenState.Lights ="On"
	}	
	if(KitchenSpeaker.getStatus()==0){
			ShopState.Speaker ="Off"
			} else {
			KitchenState.Speaker="On"
	}
};
    }

    /*TODO: create logic to return the KitchenState*/
    public KitchenState output() {
    }

    public RoomRecognition getRoomrecognition() {
        return roomrecognition;
    }

    public void setRoomrecognition(RoomRecognition roomrecognition) {
        this.roomrecognition = roomrecognition;
    }

    public KitchenLight getKitchenlight() {
        return kitchenlight;
    }

    public void setKitchenlight(KitchenLight kitchenlight) {
        this.kitchenlight = kitchenlight;
    }

    public KitchenSpeaker getKitchenspeaker() {
        return kitchenspeaker;
    }

    public void setKitchenspeaker(KitchenSpeaker kitchenspeaker) {
        this.kitchenspeaker = kitchenspeaker;
    }
}
// Use IDE to generate toString and equals methods


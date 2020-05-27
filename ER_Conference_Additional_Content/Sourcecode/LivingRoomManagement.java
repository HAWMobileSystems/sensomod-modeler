package sensomod.generated;

public class LivingRoomManagement extends Context {

    public LivingRoomManagement(RoomRecognition roomrecognition, LivingRoomLightSensor livingroomlightsensor, LivingRoomAwningSensor livingroomawningsensor, LivingRoomTVSensor livingroomtvsensor) {
        this.name = "LivingRoomManagement";
        this.roomrecognition = roomrecognition;
        this.livingroomlightsensor = livingroomlightsensor;
        this.livingroomawningsensor = livingroomawningsensor;
        this.livingroomtvsensor = livingroomtvsensor;
    }

    private RoomRecognition roomrecognition;

    private LivingRoomLightSensor livingroomlightsensor;

    private LivingRoomAwningSensor livingroomawningsensor;

    private LivingRoomTVSensor livingroomtvsensor;

    public void decisionLogic() {
        if (Room.equals("LivingRoom")) {	
	if(LivingRoomLights.getStatus()==0){
		LivingRoomState.Lights ="Off"		
	} else {
		LivingRoomState.Lights ="On"
	}	if(LivingRoomAwning.getStatus()==0){
			LivingRoomState.Awning = "Off"
	} else {
			LivingRoomState.Awning = "On"
	}	if(LivingRoomTV.getStatus()==0){
			LivingRoomState.TV = "Off"
	} else {
			LivingRoomState.TV = "On"
	}
};
    }

    /*TODO: create logic to return the WohnzimmerState*/
    public WohnzimmerState output() {
    }

    public RoomRecognition getRoomrecognition() {
        return roomrecognition;
    }

    public void setRoomrecognition(RoomRecognition roomrecognition) {
        this.roomrecognition = roomrecognition;
    }

    public LivingRoomLightSensor getLivingroomlightsensor() {
        return livingroomlightsensor;
    }

    public void setLivingroomlightsensor(LivingRoomLightSensor livingroomlightsensor) {
        this.livingroomlightsensor = livingroomlightsensor;
    }

    public LivingRoomAwningSensor getLivingroomawningsensor() {
        return livingroomawningsensor;
    }

    public void setLivingroomawningsensor(LivingRoomAwningSensor livingroomawningsensor) {
        this.livingroomawningsensor = livingroomawningsensor;
    }

    public LivingRoomTVSensor getLivingroomtvsensor() {
        return livingroomtvsensor;
    }

    public void setLivingroomtvsensor(LivingRoomTVSensor livingroomtvsensor) {
        this.livingroomtvsensor = livingroomtvsensor;
    }
}
// Use IDE to generate toString and equals methods


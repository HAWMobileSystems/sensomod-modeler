package sensomod.generated;

public class ConferenceManagement extends Context {

    public ConferenceManagement(RoomRecognition roomrecognition, ConferenceRoomAwning conferenceroomawning, ConferenceRoomSpeaker conferenceroomspeaker, ConferenceRoomTV conferenceroomtv) {
        this.name = "ConferenceManagement";
        this.roomrecognition = roomrecognition;
        this.conferenceroomawning = conferenceroomawning;
        this.conferenceroomspeaker = conferenceroomspeaker;
        this.conferenceroomtv = conferenceroomtv;
    }

    private RoomRecognition roomrecognition;

    private ConferenceRoomAwning conferenceroomawning;

    private ConferenceRoomSpeaker conferenceroomspeaker;

    private ConferenceRoomTV conferenceroomtv;

    public void decisionLogic() {
        if (Room.equals("ConferenceRoom")) {
	
	if(ConferenceRoomAwning.getStatus()==0){
		ConferenceRoomState.Awning ="Off"
		
		} else {
		ConferenceRoomState.Awning ="On"
	}
	
	if(ConferenceRoomSpeaker.getStatus()==0){
		
		ConferenceRoomState.Speaker ="Off"
		
		} else {
		
		ConferenceRoomState.Speaker="On"
	}

	if(ConferenceRoomTV.getStatus()==0){
		
		ConferenceRoomState.TV ="Off"
		
		} else {
		
		ConferenceRoomState.TV="On"
	}
}
;
    }

    /*TODO: create logic to return the MeetingState*/
    public MeetingState output() {
    }

    public RoomRecognition getRoomrecognition() {
        return roomrecognition;
    }

    public void setRoomrecognition(RoomRecognition roomrecognition) {
        this.roomrecognition = roomrecognition;
    }

    public ConferenceRoomAwning getConferenceroomawning() {
        return conferenceroomawning;
    }

    public void setConferenceroomawning(ConferenceRoomAwning conferenceroomawning) {
        this.conferenceroomawning = conferenceroomawning;
    }

    public ConferenceRoomSpeaker getConferenceroomspeaker() {
        return conferenceroomspeaker;
    }

    public void setConferenceroomspeaker(ConferenceRoomSpeaker conferenceroomspeaker) {
        this.conferenceroomspeaker = conferenceroomspeaker;
    }

    public ConferenceRoomTV getConferenceroomtv() {
        return conferenceroomtv;
    }

    public void setConferenceroomtv(ConferenceRoomTV conferenceroomtv) {
        this.conferenceroomtv = conferenceroomtv;
    }
}
// Use IDE to generate toString and equals methods


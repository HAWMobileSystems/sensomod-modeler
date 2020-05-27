package sensomod.generated;

public class ConferenceRoomAwningOn extends ContextDescription {

    public ConferenceRoomAwningOn(ConferenceManagement conferencemanagement) {
        this.name = "ConferenceRoomAwningOn";
        this.conferencemanagement = conferencemanagement;
    }

    private ConferenceManagement conferencemanagement;

    public void contextExpression() {
        ConferenceRoom.Awning =On;
    }

    public ConferenceManagement getConferencemanagement() {
        return conferencemanagement;
    }

    public void setConferencemanagement(ConferenceManagement conferencemanagement) {
        this.conferencemanagement = conferencemanagement;
    }
}
// Use IDE to generate toString and equals methods


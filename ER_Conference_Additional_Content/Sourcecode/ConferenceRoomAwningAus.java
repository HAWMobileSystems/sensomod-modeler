package sensomod.generated;

public class ConferenceRoomAwningAus extends ContextDescription {

    public ConferenceRoomAwningAus(ConferenceManagement conferencemanagement) {
        this.name = "ConferenceRoomAwningAus";
        this.conferencemanagement = conferencemanagement;
    }

    private ConferenceManagement conferencemanagement;

    public void contextExpression() {
        ConferenceRoom.Awning =Off;
    }

    public ConferenceManagement getConferencemanagement() {
        return conferencemanagement;
    }

    public void setConferencemanagement(ConferenceManagement conferencemanagement) {
        this.conferencemanagement = conferencemanagement;
    }
}
// Use IDE to generate toString and equals methods


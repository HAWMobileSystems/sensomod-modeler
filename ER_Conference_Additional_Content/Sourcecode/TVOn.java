package sensomod.generated;

public class TVOn extends ContextDescription {

    public TVOn(ConferenceManagement conferencemanagement) {
        this.name = "TVOn";
        this.conferencemanagement = conferencemanagement;
    }

    private ConferenceManagement conferencemanagement;

    public void contextExpression() {
        ConferenceRoom.TV = On;
    }

    public ConferenceManagement getConferencemanagement() {
        return conferencemanagement;
    }

    public void setConferencemanagement(ConferenceManagement conferencemanagement) {
        this.conferencemanagement = conferencemanagement;
    }
}
// Use IDE to generate toString and equals methods


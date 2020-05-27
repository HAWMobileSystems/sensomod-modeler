package sensomod.generated;

public class SpeakerOn extends ContextDescription {

    public SpeakerOn(ConferenceManagement conferencemanagement) {
        this.name = "SpeakerOn";
        this.conferencemanagement = conferencemanagement;
    }

    private ConferenceManagement conferencemanagement;

    public void contextExpression() {
        ConferenceRoom.Speaker =On;
    }

    public ConferenceManagement getConferencemanagement() {
        return conferencemanagement;
    }

    public void setConferencemanagement(ConferenceManagement conferencemanagement) {
        this.conferencemanagement = conferencemanagement;
    }
}
// Use IDE to generate toString and equals methods


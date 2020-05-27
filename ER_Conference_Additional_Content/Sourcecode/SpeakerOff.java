package sensomod.generated;

public class SpeakerOff extends ContextDescription {

    public SpeakerOff(ConferenceManagement conferencemanagement) {
        this.name = "SpeakerOff";
        this.conferencemanagement = conferencemanagement;
    }

    private ConferenceManagement conferencemanagement;

    public void contextExpression() {
        ConferenceRoom.Speaker = Off;
    }

    public ConferenceManagement getConferencemanagement() {
        return conferencemanagement;
    }

    public void setConferencemanagement(ConferenceManagement conferencemanagement) {
        this.conferencemanagement = conferencemanagement;
    }
}
// Use IDE to generate toString and equals methods


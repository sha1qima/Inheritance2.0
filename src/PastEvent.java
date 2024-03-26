import java.time.LocalDate;

public class PastEvent {
    
    private String paymentStatus;//Overdue,Paid,Extended
    private boolean requiresExtension;
    private String paymentDetails;
    private LocalDate evenStartDate;
    private LocalDate eventEndDate;
    private static final double eventCost = 10_000;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContack;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCost calculateEventCostObject;

    
    public PastEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {
        
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventPointOfContack() {
        return eventPointOfContack;
    }

    public void setEventPointOfContack(String eventPointOfContack) {
        this.eventPointOfContack = eventPointOfContack;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }

    public int getTotalEventDays() {
        return totalEventDays;
    }

    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
    }

    public String toString(){
        return "\n" + "Event ID: " + getEventID() + "\n" +
        "The past event details: " + "\n" +
        "The payment details are as follows: " + "\n" +
        paymentDetails;
    }
}

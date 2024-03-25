public class PastEvent extends Event{

    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    private double pastEventCost;

    public PastEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {

        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
        
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }

    public boolean getRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    public void setPaymentDetails(String paymentStatus, boolean requiresExtension) {
        this.paymentDetails = "The event cost was " +  pastEventCost + " and the payment status is " + paymentStatus + 
        "\n" + "The Customer requires extension?: " + requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    @Override
    public String toString(){
        return "\n" + "Event ID: " + getEventID() + "\n" +
        "The past event details: " + "\n" +
        "The payment details are as follows: " + "\n" +
        paymentDetails;
    }
    
    public void calculateCost(){
        Event event = new Event();
        double cost = 1000 + (1000 * event.tax);
    }
}


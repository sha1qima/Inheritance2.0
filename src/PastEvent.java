import java.time.LocalDate;

public class PastEvent {
    
    private String paymentStatus;//Overdue,Paid,Extended
    private boolean requiresExtension;
    private String paymentDetails;
    //private double pastEventCost;
    private LocalDate evenStartDate;
    private LocalDate eventEndDate;
    private static final double eventCost = 10_000;
    private static final double pastEventCost = 10_000;
    private static final double tax = 0.3;

    public PastEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {
        
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean isRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }
    
    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = "The event cost was " + eventCost + "and the payment status is " + paymentStatus + ". The Customer requires extension?: " + requiresExtension + ".";
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }
    
    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }
    
    public LocalDate getEvenStartDate() {
        return evenStartDate;
    }

    public void setEvenStartDate(LocalDate evenStartDate) {
        this.evenStartDate = evenStartDate;
    }

    public LocalDate getEventEndDate() {
        return eventEndDate;
    }

    public void calculateCost(){
        double cost = 1000 + (1000 * tax);
    }

    @Override
    public String toString(){
        return "\n" + "Event ID: " + getEventID() + "\n" +
        "The past event details: " + "\n" +
        "The payment details are as follows: " + "\n" +
        paymentDetails;
    }
}

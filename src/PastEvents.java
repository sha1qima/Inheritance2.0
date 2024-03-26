import java.time.LocalDate;

public class PastEvents extends Event{
    
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10_000;
    private String paymentDetails;

    public PastEvents(String eventName, String eventLocation, LocalDate eventStartDate, LocalDate eventEndDate,
                      String paymentStatus, boolean requiresExtension) {
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
        this.paymentDetails = "The event cost was $" + eventCost + " and the payment status is " + paymentStatus +
                ". The Customer requires extension?: " + requiresExtension + ".";
    }

    @Override
    public String toString() {
        return "Past Event Details: " +
                "\nEvent Name: " + getEventName() +
                "\nEvent Location: " + getEventLocation() +
                "\nEvent Start Date: " + eventStartDate +
                "\nEvent End Date: " + eventEndDate +
                "\nPayment Status: " + paymentStatus +
                "\nRequires Extension: " + requiresExtension +
                "\n" + paymentDetails;
    }
}


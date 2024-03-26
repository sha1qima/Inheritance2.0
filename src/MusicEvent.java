public class MusicEvent extends Event{
    private double musicEventCost;
    private CalculateEventCostClass calculateEventCostObject;
    private double ticketCost;

    public MusicEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, double ticketCost){
        this.calculateEventCostObject = new CalculateEventCostClass();
        this.ticketCost = ticketCost;
    }

    @Override
    public void calculateEventCost(){
        double eventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.2);
        musicEventCost = eventCost + (ticketCost * getTotalParticipants() * getTotalEventDays());
    }

    @Override
    public String toString(){
        return "Music Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" +
        "Event Name: " + getEventName() + "\n" +
        "Event Location: " + getEventLocation() + "\n" +
        "Total participants: " + getTotalParticipants() + "\n" +
        "Total Music Event Cost: " + musicEventCost;
    } 
}


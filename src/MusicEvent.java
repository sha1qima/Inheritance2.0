public class MusicEvent extends Event{
    
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double MusicConsertEventCost;
  
    public MusicEvent(String eventID, String eventName, String eventLocation, String pointOfContact, double eventCost, int totalParticipants, int totalEventDays){
        super(eventID, eventName, eventLocation, pointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseCost = merchandiseCost;
    }

    public double getMerchandiseCost() {
        return merchandiseCost;
    }

    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    @Override
    public void calculateEventCost(){
        MusicConsertEventCost = merchandiseCost + getEventCost();
    }

    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" +
        "Event Name: " + getEventName()+"\n"+
        "Event Location: " + getEventLocation() + "\n"+
        "Point of Contact: " + getPointOfContact() + "\n"+
        "Total participants: " + getTotalParticipants() + "\n"+
        "Total Conference Cost: " + getMerchandiseCost() + "\n";
    }
}

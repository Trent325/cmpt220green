import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Problem3 {

    public static class Flight{
        String FlightNo;
        GregorianCalendar arrivalTime;
        GregorianCalendar departureTime;

        public Flight(String number, GregorianCalendar Arrive, GregorianCalendar Depart){
            this.FlightNo = number;
            this.arrivalTime = Arrive;
            this.departureTime = Depart;
        }

        public String FlightNoGetter(){
            return FlightNo;
        }

        public GregorianCalendar arriveTimeGetter(){
            return arrivalTime;
        }

        public GregorianCalendar departTimeGetter(){
            return departureTime;
        }

        public void arriveTimeSetter(GregorianCalendar arrive){
            this.arrivalTime = arrive;
        }

        public void departTimeSetter(GregorianCalendar depart){
            this.arrivalTime = depart;
        }

        public void flightNoSetter(String Time){
            this.FlightNo = Time;
        }
        public long getFlightTime() {
            return (arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis())/(1000 * 60); 
            }
            
    }

    public static class Itineray{
        ArrayList<Flight> flight;

        public Itineray(ArrayList<Flight> flight){
            this.flight = flight;
        }

        public long getTotalTravelTime(){
            long totalTravelTime = 0;

            if(flight.size() > 0){

                GregorianCalendar firstFlightDeparture = flight.get(0).departTimeGetter();

                GregorianCalendar lastFlightArrival = flight.get(flight.size()-1).arriveTimeGetter();

                totalTravelTime = (lastFlightArrival.getTimeInMillis() - firstFlightDeparture.getTimeInMillis())/(1000 * 60);
            }

            return totalTravelTime;
        }

        public long getTotalFlightTime() {
            long totalFlightTime = 0;
            
            for(int i = 0; i < flight.size(); i++) {
            totalFlightTime += flight.get(i).getFlightTime();
            }
            return totalFlightTime;
            }

    }

    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230",
        new GregorianCalendar(2014, 4, 5, 5, 5, 0),
        new GregorianCalendar(2014, 4, 5, 6, 15, 0))); 
        flights.add(new Flight("US235",
        new GregorianCalendar(2014, 4, 5, 6, 55, 0),
        new GregorianCalendar(2014, 4, 5, 7, 45, 0))); 
        flights.add(new Flight("US237",
        new GregorianCalendar(2014, 4, 5, 9, 35, 0),
        new GregorianCalendar(2014, 4, 5, 12, 55, 0))); 
        Itineray itinerary = new Itineray(flights);
        System.out.println("Total Travel time: " + itinerary.getTotalTravelTime());
        System.out.println("Total Flight time: " + itinerary.getTotalFlightTime());
        }

}
    


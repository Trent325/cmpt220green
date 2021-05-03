import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Problem3 {

    public static class Flight {
        String flightNo;
        GregorianCalendar arrivalTime;
        GregorianCalendar departureTime;

        public Flight(String number, GregorianCalendar arrivalTime, GregorianCalendar departureTime) {
            this.flightNo = number;
            this.arrivalTime = arrivalTime;
            this.departureTime = departureTime;
        }

        public String getFlightNo() {
            return flightNo;
        }

        public GregorianCalendar getArriveTime() {
            return arrivalTime;
        }

        public GregorianCalendar getDepartTime() {
            return departureTime;
        }

        public void setArriveTime(GregorianCalendar arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public void setDepartTime(GregorianCalendar departureTime) {
            this.departureTime = departureTime;
        }

        public void setFlightNo(String flightNo) {
            this.flightNo = flightNo;
        }

        public long getFlightTime() {
            return (arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis()) / (1000 * 60);
        }

    }

    public static class Itineray {
        ArrayList<Flight> flights;

        public Itineray(ArrayList<Flight> flights) {
            this.flights = flights;
        }

        public long getTotalTravelTime() {
            long totalTravelTime = 0;

            if (flights.size() > 0) {
                totalTravelTime = (flights.get(flights.size() - 1).getArriveTime().getTimeInMillis()
                        - flights.get(0).getDepartTime().getTimeInMillis()) / (1000 * 60);
            }

            return totalTravelTime;
        }

        public long getTotalFlightTime() {
            long totalFlightTime = 0;

            for (int i = 0; i < flights.size(); i++) {
                totalFlightTime += flights.get(i).getFlightTime();
            }
            return totalFlightTime;
        }

    }

    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230", new GregorianCalendar(2014, 4, 5, 5, 5, 0),
                new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235", new GregorianCalendar(2014, 4, 5, 6, 55, 0),
                new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237", new GregorianCalendar(2014, 4, 5, 9, 35, 0),
                new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        Itineray itinerary = new Itineray(flights);
        System.out.println("Total Travel time: " + itinerary.getTotalTravelTime());
        System.out.println("Total Flight time: " + itinerary.getTotalFlightTime());
    }

}

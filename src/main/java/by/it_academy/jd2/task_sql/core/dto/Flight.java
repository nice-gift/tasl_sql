package by.it_academy.jd2.task_sql.core.dto;

import java.time.OffsetDateTime;
import java.util.Objects;

public class Flight {
    private int flightId;
    private String flightNo;
    private OffsetDateTime scheduledDeparture;
    private OffsetDateTime scheduledArrival;
    private String departureAirport;
    private String arrivalAirport;
    private String status;
    private String aircraftCode;
    private OffsetDateTime actualDeparture;
    private OffsetDateTime actualArrival;

    public Flight() {
    }

    public Flight(int flightId, String flightNo, OffsetDateTime scheduledDeparture, OffsetDateTime scheduledArrival, String departureAirport, String arrivalAirport, String status, String aircraftCode, OffsetDateTime actualDeparture, OffsetDateTime actualArrival) {
        this.flightId = flightId;
        this.flightNo = flightNo;
        this.scheduledDeparture = scheduledDeparture;
        this.scheduledArrival = scheduledArrival;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.status = status;
        this.aircraftCode = aircraftCode;
        this.actualDeparture = actualDeparture;
        this.actualArrival = actualArrival;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public OffsetDateTime getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(OffsetDateTime scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public OffsetDateTime getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(OffsetDateTime scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public OffsetDateTime getActualDeparture() {
        return actualDeparture;
    }

    public void setActualDeparture(OffsetDateTime actualDeparture) {
        this.actualDeparture = actualDeparture;
    }

    public OffsetDateTime getActualArrival() {
        return actualArrival;
    }

    public void setActualArrival(OffsetDateTime actualArrival) {
        this.actualArrival = actualArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightId, flight.flightId) && Objects.equals(flightNo, flight.flightNo) && Objects.equals(scheduledDeparture, flight.scheduledDeparture) && Objects.equals(scheduledArrival, flight.scheduledArrival) && Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(arrivalAirport, flight.arrivalAirport) && Objects.equals(status, flight.status) && Objects.equals(aircraftCode, flight.aircraftCode) && Objects.equals(actualDeparture, flight.actualDeparture) && Objects.equals(actualArrival, flight.actualArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, flightNo, scheduledDeparture, scheduledArrival, departureAirport, arrivalAirport, status, aircraftCode, actualDeparture, actualArrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", scheduledDeparture='" + scheduledDeparture + '\'' +
                ", scheduledArrival='" + scheduledArrival + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", status='" + status + '\'' +
                ", aircraftCode='" + aircraftCode + '\'' +
                ", actualDeparture='" + actualDeparture + '\'' +
                ", actualArrival='" + actualArrival + '\'' +
                '}';
    }
}
